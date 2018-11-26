package TrviaGame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InitialPanel extends JPanel
{
  public InitialPanel(CardLayout cl, JPanel container)
  {
    InitialControl idc = new InitialControl(cl, container);
    
    JPanel inner = new JPanel(new GridLayout(3,1));
    
    JLabel jlabel = new JLabel("Account Information");
    
    JButton button1 = new JButton("Login");
    JButton button2 = new JButton("Create");
    
    button1.addActionListener(idc);
    button2.addActionListener(idc);
    
    inner.add(jlabel);
    inner.add(button1);
    inner.add(button2);
    this.add(inner);
    
    return; 
  }
  
  public static JPanel createView(CardLayout cl, JPanel container )
  {
    InitialControl idc = new InitialControl(cl, container);
    JPanel jp = new JPanel();
    JPanel inner = new JPanel(new GridLayout(3,1));
    
    JLabel jlabel = new JLabel("Select A Choice Below");
    jp.add(jlabel);
    
    JButton button1 = new JButton("Login");
    JButton button2 = new JButton("Create");
    
    button1.addActionListener(idc);
    button2.addActionListener(idc);
    
    inner.add(jlabel);
    inner.add(button1);
    inner.add(button2);
    jp.add(inner);
    
    return jp;
  }
}
