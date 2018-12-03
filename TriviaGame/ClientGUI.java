package TriviaGame;

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
  private JPanel view6;
  private JPanel view7;
  private TriviaClient client;
  private CardLayout cl = new CardLayout();
  private JPanel container = new JPanel(cl);
  public ClientGUI()
  {
    //Set close
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    client = new TriviaClient();
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
    CardLayout cardLayout = new CardLayout();
    JPanel container = new JPanel(cardLayout);
    
    //Create the different views
    LoginControl lc = new LoginControl(container,client);
    CreateAccountControl ca = new CreateAccountControl(container,client);
    ReadyControl rp = new ReadyControl(container,client);
    //QuestionsControl qp = new QuestionsControl(container,client); 
    AnswerControl ap = new AnswerControl(container,client);
    //EndGameSSControl egp = new EndGameSSControl(container,client);
    
    JPanel view1 = new LoginPanel(lc);
    JPanel view2 = new CreateAccount(ca);
    JPanel view3 = new ReadyPanel(rp);
    //JPanel view4 = new QuestionsPanel(qp);
    JPanel view5 = new AnswerPanel(ap);
    //JPanel view6 = new EndGamePanel(egp);
    
    //Add the different views to the CardLayoutContainer
    container.add(view1,"1");
    container.add(view2,"2");
    container.add(view3,"3");
   // container.add(view4,"4");
    container.add(view5,"5");
   // container.add(view6,"6");
    
    //Show the first 1
    CardLayout cl = (CardLayout)container.getLayout();
    cl.show(container, "1");
    
    this.add(container,BorderLayout.CENTER);
        
    this.setSize(500,300);
    this.setVisible(true);  
  }
 
  public static void main(String[] args)
  {
    new ClientGUI();
  }
}
