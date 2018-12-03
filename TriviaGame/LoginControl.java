//This manages the information related to clients login
//This looks mostly done

package TriviaGame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class LoginControl implements ActionListener {
  private JPanel container;
  private TriviaClient client;
  private TextField username;
  private JPasswordField password;
  
  public LoginControl(JPanel container, TriviaClient client) {
    this.container = container;
    this.client = client;
    try {
		client.openConnection();
	} catch (IOException e) {
		e.printStackTrace();
	}}
  
  public void actionPerformed(ActionEvent ae) {    
    String command = ae.getActionCommand();

    if (command.equals("Create Account")) {
      CardLayout cl = (CardLayout)container.getLayout();
      cl.show(container, "2");
    }
    
    if(command.contentEquals("Submit")) {
    	LoginPanel lp = (LoginPanel)container.getComponent(0);
	    LoginData ld = new LoginData(lp.getUserName(), lp.getPassword());
	    try {
	    	client.sendToServer(ld);
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	String toCompare = (String)client.getServerMsg();
	    	if(toCompare.equals("Success"))
	    	{
	    		CardLayout cl = (CardLayout)container.getLayout();
	    		cl.show(container, "3");
	    	}
	 	} catch (IOException e1) {
	 		e1.printStackTrace();
	 	}    
    }}
    
  public void displayError(String error) {
   	 LoginPanel lp= (LoginPanel)container.getComponent(1);
   	 lp.setErrorMsg(error);
   	}}