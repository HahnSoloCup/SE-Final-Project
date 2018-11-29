package TrviaGame;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ClientGUI extends JFrame
{
  private JPanel view1;
  private JPanel view2;
  private JPanel view3;
  private JPanel view4;
  private JPanel view5;
  private ChatClient client;
  private CardLayout cl = new CardLayout();
  private JPanel container = new JPanel(cl);
  public ClientGUI()
  {
    //Set close
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    client = new ChatClient();
    client.setHost("localhost");
    client.setPort(8300);
    try
    {
      client.openConnection();
    } catch (IOException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }   
    
    //Set container to CardLayout
    container = new JPanel(cl);
    client.setContainer(container);
    client.setCardLayout(cl);
    CreateAccountControl cc=new CreateAccountControl(container,client);
    
    //Create the different views
    view1 = new InitialPanel(cl,container);
    view2 = new LoginPanel(cl,container,client);
    view3 = new CreateAccount(cc);
    view4 = new Ready_Panel(cl,container,client);
    view5=  new QuestionsPanel(cl,container,client);
    
    //Add the different views to the CardLayoutContainer
    container.add(view1,"1");
    container.add(view2,"2");
    container.add(view3,"3");
    container.add(view4,"4");
    container.add(view5,"5");
      
    //Show the first 1
    cl.show(container, "2");
    
    this.add(container,BorderLayout.CENTER);
        
    this.setSize(500,300);
    this.setVisible(true);  
  }
 
  public static void main(String[] args)
  {
    new ClientGUI();
  }
}
