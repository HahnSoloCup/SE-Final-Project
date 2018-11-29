package TrviaGame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class readyControl implements ActionListener
{
  private CardLayout cl;
  private JPanel container;
  private ChatClient client;

  
  public readyControl(CardLayout cl, JPanel container, ChatClient client)
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

    if (command.equals("Log Out"))
    {
      cl.show(container, "2");
    }
    
    if(command.contentEquals("Let's Play!"))
    {


	    cl.show(container, "5");
    }
  }
public void displayError(String error)
{
  
}
}
  