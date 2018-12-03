//This manages the account creation
//This looks mostly done

package TriviaGame;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateAccountControl implements ActionListener{
	private JPanel container;
	private TriviaClient client;
	
	public CreateAccountControl(JPanel container, TriviaClient client) {
		this.container = container;
		this.client = client;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		CreateAccount createAccount = (CreateAccount)container.getComponent(2);
		String username = createAccount.getUsername();
		String password = createAccount.getPassword();
		String password2 = createAccount.getPassword2();
		CreateAccountData cad = new CreateAccountData(username, password, password2);
		
		 if (command == "Cancel") { 
			CardLayout cl = (CardLayout)container.getLayout();
		    cl.show(container, "1");
		 }
		 else if(command=="Submit") {
			if (username.isEmpty()|| password.isEmpty()) {
				displayError("You must enter a username and password!");
				return;
			}
			if(password.length() < 6 && password.length() != 0) {
				displayError("Your password is not the correct length!");
				return;
			}
			if(!password.equals(password2)) {
				displayError("Your passwords do not match!");
				return;
			}
			else {
				try {
					client.openConnection();
					client.sendToServer(cad);
					System.out.println("hello");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println((String)client.getServerMsg());
					if((String)client.getServerMsg() == "Success") {
						CardLayout cl = (CardLayout)container.getLayout();
						cl.show(container, "3");
					}
					//else if((String)client.getServerMsg() == "Taken") 
						//displayError("Username Taken!");
					else if((String)client.getServerMsg() == "Exists") 
						displayError("That Account Already Exists!");
					else
						displayError("Internal Server Error!");
				} catch (IOException e2) {
					e2.printStackTrace();
			}}}
		 }
	public void displayError(String error) {
	    CreateAccount createAccountPanel = (CreateAccount)container.getComponent(1);
	    createAccountPanel.setError(error);
	  }
	}
