package TrviaGame;

import java.awt.CardLayout;

import javax.swing.JPanel;

import ocsf.client.AbstractClient;

public class ChatClient extends AbstractClient
{
  private CardLayout cl;
  private JPanel container;
 
  
  public ChatClient()
  {
    super("localhost",8300);
  }
  
  public void setCardLayout(CardLayout cl)
  {
	this.cl = cl;
  }
//  public void setLoginPanel(JPanel lp)
//  {
//	  this.lp=lp;
//  }
  
  public void setContainer(JPanel container)
  {
	this.container = container;
  }

  @Override
  public void handleMessageFromServer(Object arg0)
  {
	  LoginPanel lp= (LoginPanel)container.getComponent(3);
	  System.out.println(arg0.toString());
	    if(arg0.toString().equals("Creation"))
	    {
	    cl.show(container, "1");
	    }
	  
	    System.out.println(arg0.toString());
	    if(arg0.toString().equals("Valid"))
	    {
	    	System.out.println("test");
	    cl.show(container, "4");
	    }
	    else
	    {
	    	lp.setErrorMsg("Username/Password is invalid testing");
	    	cl.show(container, "3");
	    }
	
  }
  
  public void connectionException (Throwable exception) 
  {
    //Add your code here
  }
  public void connectionEstablished()
  {
    System.out.println("Connection established");
  }
}
