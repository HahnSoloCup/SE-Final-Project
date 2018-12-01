package TrviaGame;

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

public class AnswerPanel extends JPanel {
	private JTextField usernameField;
	private JLabel roundLabel;
	public void setRoundNumber(String round)
	  {
		System.out.println(round);
	    roundLabel.setText(round);
	  }

	public AnswerPanel(CardLayout cl, JPanel container, ChatClient client)
	{
		JPanel inner = new JPanel( );
		inner.setLayout(cl);
		inner.setBounds(250,15,1,1);
		inner.setLayout(null);
		setLayout(null);
		AnswerControl ac=new AnswerControl(cl,container,client);
		
		JLabel welcomeLabel = new JLabel("Correct!/Wrong!");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setBounds(140, 8, 180, 20);
		add(welcomeLabel);
		//logOut.setBounds(318, 168, 120, 50);
		
		//deleteContact.setSize(120, 50);
	

		roundLabel = new JLabel("Round 1/5");
		roundLabel.setHorizontalAlignment(SwingConstants.CENTER);
		roundLabel.setBounds(140, 180, 180, 20);
		add(roundLabel);
		
	
		 JLabel p1Label=new JLabel();
		 p1Label.setBounds(12, 50, 130,30);
		 add(p1Label);
		 p1Label.setText("Player 1 Total Score");

		JTextField p1Pts = new JTextField();
		p1Pts.setBounds(12, 80, 100,30);
		add(p1Pts);
		p1Pts.setColumns(3);
		p1Pts.setEditable(false);
		p1Pts.setText("1 pts");
		

		 JLabel p2Label=new JLabel();
		 p2Label.setBounds(160, 50, 130,30);
		 add(p2Label);
		 p2Label.setText("Player 2 Total Score");
		
		JTextField p2Pts = new JTextField();
		p2Pts.setBounds(160, 80, 100,30);
		add(p2Pts);
		p2Pts.setColumns(3);
		p2Pts.setEditable(false);
		p2Pts.setText("10 pts");
		 
		 
		JButton playButton = new JButton("Next Round");
		playButton.setBounds(300, 80, 150, 35);
		add(playButton);
		playButton.setPreferredSize(new Dimension(30,30));
		playButton.addActionListener(ac);

		
		
		//addContact.setBounds(161, 168, 120, 50);
		
		this.add(inner);
	}
	
	

}


