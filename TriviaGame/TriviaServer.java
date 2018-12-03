package TriviaGame;

import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class TriviaServer extends AbstractServer
{
  private JTextArea log;
  private JLabel status;
  private Database database;
  
  public TriviaServer()
  {
    super(12345);
    database = new Database();
  }
  
  public TriviaServer(int port)
  {
    super(port);
  }
  
  public void setDataBase(Database database)
  {
	  this.database = database;
  }
  
  public void setLog(JTextArea log)
  {
    this.log = log;
  }
  
  public void setStatus(JLabel status)
  {
    this.status = status;
  }
  
  public JTextArea getLog()
  {
    return log;
  }
  
  public JLabel getStatus()
  {
    return status;
  }
  
  public Database getDatabase()
  {
	  return database;
  }
  
  @Override
  protected void handleMessageFromClient(Object arg0, ConnectionToClient arg1)
  {   
    if (arg0 instanceof LoginData)
    {
    	
       //String data = arg0.toString();
       LoginData ld = (LoginData)arg0;
       String un = ld.getUserName();
       String pass = ld.getPassword();
       String data = (un + "," + pass);
       ArrayList<String> validUserInfo = database.query("select username, password from users where username = '" + un + "';");
       System.out.println(validUserInfo.get(1));
       if(un.equals(validUserInfo.get(0)) && pass.equals(validUserInfo.get(1)))
       {
    	   try
    	   {
    		   arg1.sendToClient("Success");  
    	   }
    	   catch(IOException e)
    	   {
    		   e.printStackTrace();
    	   }
       }
       else
       {
    	   try
    	   {
    		 
    		   arg1.sendToClient("Incorrect Username or Password");   
    	   }
    	   catch(IOException e)
    	   {
    		   e.printStackTrace();
    	   }
       }
    }
    
    else if (arg0 instanceof CreateAccountData)
    {
       CreateAccountData cad = (CreateAccountData)arg0;
       String holder = "insert into users values('" + cad.getUserName().toString() + "','" + cad.getPassword().toString() + "');";
       boolean validUserInfo = database.executeDML(holder);
       
       if(validUserInfo)
       {
    	   try
    	   {
    		   arg1.sendToClient("Success");
    	   }
    	   catch(IOException e)
    	   {
    		   e.printStackTrace();
    	   }
       }
       else
       {
    	   try
    	   {
    		arg1.sendToClient("Invalid data");   
    	   }
    	   catch(IOException e)
    	   {
    		   e.printStackTrace();
    	   }
       }
    }
    /*
    else if (arg0 instanceof QuestionData)
    {
    	QuestionData qd = (QuestionData)arg0;
    	if (qd.getAnswer().equals(qd.getRightAnswer()))
    	{
    		
    	}
    }
    
    else if (arg0 instanceof String)
    {
    	else if (arg0.equals("Ready"))
    	{
    		ReadyControl rc = (ReadyControl)arg0;
    		rc.playerReady = true;
    		arg1.sendToClient(rc.playerReady);
    	}
    	
    	else if (arg0.equals("Disconnect"))
    	{
    		ReadyControl rc = (ReadyControl)arg0;
    		rc.playerReady = false;
    		arg1.sendToClient(rc.playerReady);
    		
    	} 
  
    	else if (arg0.equals("Ready Room"))
    	{
    	
    	}
  
    	else if (arg0.equals("Need Question"))
    	{
    		QuestionData qd = (QuestionData)arg0;
    		arg1.sendToClient(qd.getQuestion());
    	}
    
    }
  */
  }
  
  protected void listeningException(Throwable exception) 
  {
    //Display info about the exception
    log.append("Listening Exception:" + exception);
    exception.printStackTrace();
    log.append(exception.getMessage());
    
    if (this.isListening())
    {
      log.append("Server not Listening\n");
      status.setText("Not Connected");
      status.setForeground(Color.RED);
    }
  }
  
  protected void serverStarted() 
  {
    log.append("Server Started");
    status.setText("Listening...");
    status.setForeground(Color.GREEN);
  }
  
  protected void serverStopped() 
  {
	  log.append("Server Stopped Accepting New Clients - Press Listen to Start Accepting New Clients\n");
	  status.setText("Stopped");
	  status.setForeground(Color.RED);
   
  }
  
  protected void serverClosed() 
  {
	  log.append("Server and all current clients are closed - Press Listen to Restart\n");
	  status.setText("Closed");
	  status.setForeground(Color.RED);
  }
 
  protected void clientConnected(ConnectionToClient client) 
  {
	  log.append("Client Connected\n");
	  status.setText("Connected");
	  status.setForeground(Color.GREEN);
      
  }
}

