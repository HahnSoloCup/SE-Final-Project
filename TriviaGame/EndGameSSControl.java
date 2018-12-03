//This manages the information sent to and from the server after a session has ended
/*
package TriviaGame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;

public class EndGameSSControl implements ActionListener {
	private JPanel container;
	private TriviaClient client;
	
	public EndGameSSControl(JPanel container, TriviaClient client) {
	    this.container = container;
	    this.client = client;
	    /*try {
	    	client.sendToServer("Need Results");
	    	Thread.sleep(1000);
	    	ArrayList<String> gameResults = (ArrayList<String>)client.getServerMsg();
	    } catch(IOException e) {
	    	e.printStackTrace();
	   }}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String command = ae.getActionCommand();
		if (command.equals("Play Again")) {
			try {
				client.sendToServer("Play Again");
				CardLayout cl = (CardLayout)container.getLayout();
				cl.show(container, "4");
			} catch(IOException e) {
				e.printStackTrace();
		}}}
	
	public void displayResults(ArrayList<String> REEE) {
		EndGamePanel edp = (EndGamePanel)container.getComponent(7);
		//edp.setPlayersScore(REEE);
		}
	}*/