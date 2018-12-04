//This manages the account creation
//This looks mostly done

package ClientCommunication;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

import ClientCommunication.LoginControl.WaitingThread;

public class CreateAccountControl implements ActionListener{
	private JPanel container;
	private TriviaClient client;
	
	class WaitingThread implements Runnable {
		@Override
		public void run() {
			while(true) {
				try {Thread.sleep(1000);
				} catch (InterruptedException e1) {e1.printStackTrace();}
				if(client.getServerMsg() instanceof String) {
					String toCheck = (String)client.getServerMsg();
					if(toCheck.equals("Move Questions")) {
						try {
							client.sendToServer("Need Question");
							Thread.sleep(500);
						} catch (IOException | InterruptedException e) {e.printStackTrace();}
						
						QuestionData toSend = (QuestionData)client.getServerMsg();
						UpdateGUI(toSend);
						CardLayout cl = (CardLayout)container.getLayout();
			    		cl.show(container, "3");
			    		break;
					}}}}
		  		}
	
	public CreateAccountControl(JPanel container, TriviaClient client) {
		this.container = container;
		this.client = client;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		CreateAccount createAccount = (CreateAccount)container.getComponent(1);
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
				displayError("You must enter a username and password!", false);
				return;
			}
			if(password.length() < 6 && password.length() != 0) {
				displayError("Your password is not the correct length!", false);
				return;
			}
			if(!password.equals(password2)) {
				displayError("Your passwords do not match!", false);
				return;
			}
			else {
				try {
					client.openConnection();
					client.sendToServer(cad);
					System.out.println("hello");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {e1.printStackTrace();}
					String toCheck = (String)client.getServerMsg();
					if(toCheck.equals("Success")) {
						try {
						client.openConnection();
			    		client.sendToServer("Ready");
			    		displayError("Success! Waiting...", true);
			    		Thread TH = new Thread(new WaitingThread()); 
			    		TH.start();
						} catch(IOException e2) {e2.printStackTrace();}
					}
					else if(toCheck.equals("Exists"))
						displayError("That Account Already Exists!", false);
					else
						displayError("Internal Server Error!", false);
				} catch (IOException e2) {
					e2.printStackTrace();
			}}}
		 }
	public void displayError(String error, boolean Decider) {
	   	 CreateAccount cp= (CreateAccount)container.getComponent(1);
	   	 cp.setErrorMsg(error);
	   	 if(Decider) cp.hideButtons();
	   	}
	
	 public void UpdateGUI(QuestionData UA) {
		QuestionsPanel qp = (QuestionsPanel)container.getComponent(2);
		qp.setQData(UA);
		}
	}

