package TriviaGame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JPanel;

public class AnswerControl implements ActionListener {
	private CardLayout cl;
	private JPanel container;
	private TriviaClient client;
	private ArrayList<String> serverMsg;
	
	public AnswerControl(JPanel container, TriviaClient client) {
	    this.container = container;
	    this.client = client;
		/*try {
			client.run();
			//ArrayList<String> serverMsg = (ArrayList<String>)client.getServerMsg();
		} catch(IOException e) {
			e.printStackTrace();
	}*/}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String command = ae.getActionCommand();
		if (command.equals("Next Round")) {
	    	displayRound("Round " + serverMsg.get(0) +"/5");
	    	
	    	if(serverMsg.get(1) == "1") 
	    		displaySucc("Incorrect!");
	    	else if(serverMsg.get(1) == "0") 
	    		displaySucc("Correct!");
	    	
	    	if(serverMsg.get(0) == "6") {
	    		CardLayout cl = (CardLayout)container.getLayout();
	    		cl.show(container, "7");
	    	}
	    	else {
	    		CardLayout cl = (CardLayout)container.getLayout();
	    		cl.show(container, "5");
	    	}
	   }}
	
	public void displayRound(String round) {
		AnswerPanel ap = (AnswerPanel)container.getComponent(6);
	    ap.setRoundNumber(round);
		}
	
	public void displaySucc(String Succ) {
		AnswerPanel ap = (AnswerPanel)container.getComponent(6);
		//ap.setSucc(round);
		}
	}	