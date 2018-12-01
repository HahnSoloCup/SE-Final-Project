package TrviaGame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class EndGameControl implements ActionListener
{
  private CardLayout cl;
  private JPanel container;
  private ChatClient client;
  private int roundNumber=1;

  
  public EndGameControl(CardLayout cl, JPanel container, ChatClient client)
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

    if (command.equals("Play Again"))
    {
    	cl.show(container, "4");
    }
    
  }
}
  
