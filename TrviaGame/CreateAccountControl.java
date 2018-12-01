package TrviaGame;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateAccountControl implements ActionListener
{
	private JPanel container;
	  private ChatClient client;
	

	
	public CreateAccountControl(JPanel container, ChatClient client)
	{
		this.container=container;
		this.client=client;
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		String command=e.getActionCommand();
		CreateAccount createAccount=(CreateAccount)container.getComponent(2);
		String username=createAccount.getUsername();
		String password=createAccount.getPassword();
		String password2=createAccount.getPassword2();
		CardLayout cardLayout = (CardLayout)container.getLayout();
		
		 if (command == "Cancel")
		    {
		    
		      cardLayout.show(container, "2");
		    }
		 else if(command=="Submit")
		{
			if (username.isEmpty()|| password.isEmpty())
			{
	        displayError("You must enter a username and password.");
	        return;
			}
			if(password.length() < 6 && password.length() != 0)
			{
				displayError("Your password is not the correct length");
				return;
			}
			if(!password.equals(password2))
			{
				displayError("Your password does not match");
				return;
			}
			else
			{
				displayError("Account Created!");
			}
			CreateAccountData cad = new CreateAccountData(username, password, password2);
			
			try
			{
				client.openConnection();
			} catch (IOException e2)
			{
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
	    	
	    	try{
	    		client.sendToServer(cad);
	    	}catch(IOException e1){
				e1.printStackTrace();
	    	}
	    	
	    	cardLayout.show(container, "2");
		}
		 
	
	}
	public void displayError(String error)
	  {
	    CreateAccount createAccountPanel = (CreateAccount)container.getComponent(2);
	    
	    createAccountPanel.setError(error);
	    
	  }

}
