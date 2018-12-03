//This manages the QuestionData between the client and servers
/*
package TriviaGame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JPanel;

public class QuestionsControl implements ActionListener {
	private JPanel container;
	private TriviaClient client;
	private QuestionData UA;
	 
	public QuestionsControl(JPanel container, TriviaClient client) {
	    this.container = container;
	    this.client = client;
	    try {
			client.sendToServer("Need Question");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			UA = (QuestionData)client.getServerMsg();
			UpdateGUI(UA);
		} catch (IOException e) {
			e.printStackTrace();
		}}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String command = ae.getActionCommand();
	    if (command.charAt(0) == 'A' || command.charAt(0) == 'B' || command.charAt(0) == 'C') {
	    	//UA.UserAnswer = command;
	    } else if(command.equals("Let's Play!")/*!(UA.UserAnswer.isEmpty())) {
	    	try {
	    		client.sendToServer(UA);
	    		CardLayout cl = (CardLayout)container.getLayout();
	    		cl.show(container, "6");
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    }}}
	
	public void UpdateGUI(QuestionData UA) {
		QuestionsPanel qp = (QuestionsPanel)container.getComponent(5);
		//qp.setQData(UA);
		}
	}
	*/