/*package TriviaGame;

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

public class EndGamePanel extends JPanel {
	private JTextField usernameField;
	private JLabel roundLabel;
	private JLabel welcomeLabel;
	private JLabel p1Label;
	private JLabel p2Label;
	public void setRoundNumber(String round)
	  {
		System.out.println(round);
	    roundLabel.setText(round);
	  }
	public void setMessage(String message)
	  {
		System.out.println(message);
	    roundLabel.setText(message);
	  }
	public void setPlayerUsername(String p1,String p2)
	  {
	    p1Label.setText(p1+" total points");
	    p2Label.setText(p2+" total points");
	  }

	public EndGamePanel(EndGameSSControl egs)
	{
		JPanel inner = new JPanel( );
		inner.setBounds(250,15,1,1);
		inner.setLayout(null);
		setLayout(null);
		
		JLabel welcomeLabel = new JLabel("Congratulation you won!/Better luck next time!");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setBounds(80,15, 300, 20);
		add(welcomeLabel);
		
		 p1Label=new JLabel();
		 p1Label.setBounds(50, 50, 130,30);
		 add(p1Label);
		 p1Label.setText("Player 1 Total Score");

		JTextField p1Pts = new JTextField();
		p1Pts.setBounds(50, 80, 100,30);
		add(p1Pts);
		p1Pts.setColumns(3);
		p1Pts.setEditable(false);
		p1Pts.setText("1 pts");
		

		 p2Label=new JLabel();
		 p2Label.setBounds(300, 50, 130,30);
		 add(p2Label);
		 p2Label.setText("Player 2 Total Score");
		 
		 JTextField p2Pts = new JTextField();
			p2Pts.setBounds(300, 80, 100,30);
			add(p2Pts);
			p2Pts.setColumns(3);
			p2Pts.setEditable(false);
			p2Pts.setText("10 pts");
		//logOut.setBounds(318, 168, 120, 50);
		
		//deleteContact.setSize(120, 50);
	
		 
		JButton playButton = new JButton("Play Again");
		playButton.setBounds(160, 130, 150, 35);
		add(playButton);
		playButton.setPreferredSize(new Dimension(30,30));
		playButton.addActionListener(egs);

		
		
		//addContact.setBounds(161, 168, 120, 50);
		
		this.add(inner);
	}

	
	

}

*/
