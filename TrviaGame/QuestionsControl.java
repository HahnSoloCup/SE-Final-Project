package TrviaGame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class QuestionsControl implements ActionListener
{
  private CardLayout cl;
  private JPanel container;
  private ChatClient client;

  
  public QuestionsControl(CardLayout cl, JPanel container, ChatClient client)
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

    if (command.equals("Quit"))
    {
      cl.show(container, "2");
    }
    
    if(command.contentEquals("Submit answer"))
    {
    	System.out.println("hello");
	   cl.show(container, "6");
    }
  }
public void displayError(String error)
{
  
}
}
  