package TrviaGame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class AnswerControl implements ActionListener
{
  private CardLayout cl;
  private JPanel container;
  private ChatClient client;
  private int roundNumber=1;

  
  public AnswerControl(CardLayout cl, JPanel container, ChatClient client)
  {
    this.cl = cl;
    this.container = container;
    this.client = client;
  }
  
  public void actionPerformed(ActionEvent ae)
  {    
    //String username = lp.getUserName();
    //String password = lp.getPassword();
    
    
    String command = ae.getActionCommand();

    if (command.equals("Next Round"))
    {
    	roundNumber++;
    	System.out.println(roundNumber);
    	displayRound("Round "+roundNumber+"/5");
    	if(roundNumber==6)
    	{
    		cl.show(container, "7");
    	}
    	else {
    		
    		cl.show(container, "5");
    	}
    }
    
  }
public void displayRound(String round)
{
	
//	AnswerPanel ap= new AnswerPanel(cl,container,client);
	AnswerPanel ap = (AnswerPanel)container.getComponent(5);
    ap.setRoundNumber(round);
}
}
  
