//This manages the information sent to and from the server after a session has ended
package ClientCommunication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JPanel;

public class EndGameSSControl implements ActionListener {
	private JPanel container;
	private TriviaClient client;
	
	public EndGameSSControl(JPanel container, TriviaClient client) {
	    this.container = container;
	    this.client = client;
	   }
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String command = ae.getActionCommand();
		if (command.equals("Exit")) {
			try {
				client.closeConnection();
				System.exit(0);
			} catch(IOException e) {
				e.printStackTrace();
		}}}
	}
