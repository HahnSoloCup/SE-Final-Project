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

public class EndGamePanel extends JPanel {
	private JTextField usernameField;
	private JLabel roundLabel;
	public void setRoundNumber(String round)
	  {
		System.out.println(round);
	    roundLabel.setText(round);
	  }

	public EndGamePanel(CardLayout cl, JPanel container, ChatClient client)
	{
		JPanel inner = new JPanel( );
		inner.setLayout(cl);
		inner.setBounds(250,15,1,1);
		inner.setLayout(null);
		setLayout(null);
		EndGameControl ec=new EndGameControl(cl,container,client);
		
		JLabel welcomeLabel = new JLabel("Congratulation you won!/Better luck next time!");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setBounds(80,80, 300, 20);
		add(welcomeLabel);
		//logOut.setBounds(318, 168, 120, 50);
		
		//deleteContact.setSize(120, 50);
	
		 
		JButton playButton = new JButton("Play Again");
		playButton.setBounds(150, 100, 150, 35);
		add(playButton);
		playButton.setPreferredSize(new Dimension(30,30));
		playButton.addActionListener(ec);

		
		
		//addContact.setBounds(161, 168, 120, 50);
		
		this.add(inner);
	}

	
	

}


