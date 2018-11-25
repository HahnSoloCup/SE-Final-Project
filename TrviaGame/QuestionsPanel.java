package TrviaGame;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class QuestionsPanel extends JPanel {
	private JTextField usernameField;
	

	public QuestionsPanel(CardLayout cl, JPanel container, ChatClient client)
	{
		JPanel inner = new JPanel( );
		inner.setLayout(cl);
		inner.setBounds(316,15,1,1);
		inner.setLayout(null);
		setLayout(null);
		readyControl rc=new readyControl(cl,container,client);
		
		JLabel questionLabel = new JLabel("Question");
		questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionLabel.setBounds(140, 8, 180, 20);
		add(questionLabel);
		
		//logOut.setBounds(318, 168, 120, 50);
		
		//deleteContact.setSize(120, 50);
		
		
		JTextArea questionArea = new JTextArea();
		questionArea.setBounds(12, 37, 426, 63);
		add(questionArea);
		questionArea.setColumns(15);
		questionArea.setWrapStyleWord(true);
		questionArea.setEditable(false);
		questionArea.setText("setText Here");
		
		JRadioButton choice1=new JRadioButton("A)setText Here");
		JRadioButton choice2=new JRadioButton("B)setText Here ");
		JRadioButton choice3=new JRadioButton("C)setText Here");
		JRadioButton choice4=new JRadioButton("D)setText Here");
		
		choice1.setBounds(12,60,200,63);
		choice2.setBounds(12,80,200,63);
		choice3.setBounds(12,100,200,63);
		choice4.setBounds(12,120,200,63);
		ButtonGroup group = new ButtonGroup();
		group.add(choice1);
		group.add(choice2);
		group.add(choice3);
		group.add(choice4);	
		setLayout(new GridLayout(0,1));
		add(choice1);
		add(choice2);
		add(choice3);
		add(choice4);
	
		
		
		
		 
		 
		JButton addContact = new JButton("Submit answer");
		addContact.setBounds(12, 200, 150, 35);
		add(addContact);
		addContact.setPreferredSize(new Dimension(30,30));
		
		JButton logout = new JButton("Quit");
		logout.setBounds(288, 200, 150, 35);
		add(logout);
		logout.setPreferredSize(new Dimension(30,30));
		logout.addActionListener(rc);
		//addContact.setBounds(161, 168, 120, 50);
		
		this.add(inner);
		
	}
	
}


