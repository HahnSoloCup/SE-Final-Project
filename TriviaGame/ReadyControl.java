//This manages the ready screen after users have signed in and are queued for a game

package TriviaGame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

public class ReadyControl implements ActionListener {
  private JPanel container;
  private TriviaClient client;
  private boolean playerReady;
  
  public ReadyControl(JPanel container, TriviaClient client) {
	    this.container = container;
	    this.client = client;
	    playerReady = false;
		
    }

    public void actionPerformed(ActionEvent ae) {   
    	updateInitial();
		updateGUI();
	    String command = ae.getActionCommand();
	    if (command.equals("Let's Play!")) {
	    	try {
	    		client.sendToServer("Ready");
	    		playerReady = true;
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    }}
	    if (command.equals("Log Out")) {
	    	if(playerReady) {
		      try {
		    	  client.sendToServer("Disconnect");
		      } catch (IOException e) {
		    	  e.printStackTrace();
		      } try {
				client.closeConnection();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}} 
	    	CardLayout cl = (CardLayout)container.getLayout();
	    	cl.show(container, "1");
	    }}
	  
    public void updateInitial() {
	  try {
		  client.sendToServer("Ready Room");
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  ArrayList<ArrayList<String>> playerList = (ArrayList<ArrayList<String>>)client.getServerMsg();
		  updateGUIInfo(playerList);
	  } catch(IOException e) {
		  e.printStackTrace();
	  }
  }
  
  public void updateGUI() {
	  client.run();
	  while(!(client.getServerMsg() instanceof Boolean)) {
		@SuppressWarnings("unchecked")
		ArrayList<ArrayList<String>> playerList = (ArrayList<ArrayList<String>>)client.getServerMsg();
		updateGUIInfo(playerList);
  }	  CardLayout cl = (CardLayout)container.getLayout();
	  cl.show(container, "5"); }
  
public void updateGUIInfo(ArrayList<ArrayList<String>> playerList) {
	  ReadyPanel rp = (ReadyPanel)container.getComponent(2);
	  for(int i=0;i<playerList.size();i++)
		rp.setPlayers(playerList.get(i).get(0), playerList.get(i).get(1), i);
  		}
	}