package TrviaGame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class LoginControl implements ActionListener
{
  private CardLayout cl;
  private JPanel container;
  private ChatClient client;
  //private TextField username;
  //private JPasswordField password;
  
  public LoginControl(CardLayout cl, JPanel container, ChatClient client)
  {
    this.cl = cl;
    this.container = container;
    this.client = client;
  }
  
  public void actionPerformed(ActionEvent ae)
  {    
	cl.show(container, "3");
	
    LoginPanel lp = (LoginPanel)container.getComponent(1);
    
    //String username = lp.getUserName();
    //String password = lp.getPassword();
    
    
    String command = ae.getActionCommand();
    
    if (command.equals("Create Account"))
    {
      cl.show(container, "3");
    }
    
    if(command.contentEquals("Submit"))
    {
	    LoginData ld = new LoginData(lp.getUserName(), lp.getPassword());
	    
	    //ld.setUsername(username);
	    //ld.setPassword(password);
	    
//	    try {
//	 			client.openConnection();
//	 		} catch (IOException e1) {
//	 			e1.printStackTrace();
//	 		}  
//	 	    
//	    
//	    try {
//			client.sendToServer(ld);
//		} catch (IOException e2) {
//			e2.printStackTrace();
//		} 
//    }
	    cl.show(container, "4");
    }
  }
public void displayError(String error)
{
  LoginPanel lp= (LoginPanel)container.getComponent(3);
  lp.setErrorMsg(error);
}
}
  