package ClientCommunication;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ClientGUI extends JFrame {
  private TriviaClient client;
  private CardLayout cl = new CardLayout();
  public ClientGUI() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    client = new TriviaClient();
    client.setHost("10.251.105.135"); //Change this to the public IP of the desired host computer to run remotely 
    client.setPort(8300);
    
    new JPanel(cl);
    CardLayout cardLayout = new CardLayout();
    JPanel container = new JPanel(cardLayout);
    
    //Create the different views
    LoginControl lc = new LoginControl(container,client);
    CreateAccountControl ca = new CreateAccountControl(container,client);
    QuestionsControl qp = new QuestionsControl(container,client); 
    EndGameSSControl egp = new EndGameSSControl(container,client);
    
    JPanel view1 = new LoginPanel(lc);
    JPanel view2 = new CreateAccount(ca);
    JPanel view3 = new QuestionsPanel(qp);
    JPanel view4 = new EndGamePanel(egp);
    
    //Add the different views to the CardLayoutContainer
    container.add(view1,"1");
    container.add(view2,"2");
    container.add(view3,"3");
    container.add(view4,"4");
    
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

