package TriviaGame;

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

public class ReadyPanel extends JPanel {
	private JTextField usernameField;
	JLabel statusLabel;
	JLabel statusLabel2;
	 JLabel p1Button;
	 JLabel p2Button;
	public void setPlayers(String username, String status, int i)
	  {
		if(i==0)
		{
	    p1Button.setText(username);
		statusLabel.setText(status);
		}
		else {
			p2Button.setText(username);
			statusLabel2.setText(status);
		}
	  }

	
	

	public ReadyPanel(ReadyControl rc)
	{
		JPanel inner = new JPanel( );
		inner.setBounds(316,15,1,1);
		inner.setLayout(null);
		setLayout(null);
		
		JLabel welcomeLabel = new JLabel("Welcome to Trivial Pursuit!");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
	
		welcomeLabel.setBounds(140, 8, 180, 20);
		add(welcomeLabel);
		//logOut.setBounds(318, 168, 120, 50);
		
		//deleteContact.setSize(120, 50);
		
		//can be used to let the user know that all player must be ready before hitting lets play
		statusLabel=new JLabel("Player x is not ready!");
		statusLabel.setForeground(Color.RED);
		 statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 statusLabel.setBounds(250,60,130,16);	
		 add(statusLabel);
		 
		 statusLabel2=new JLabel("Player x is not ready!");
			statusLabel2.setForeground(Color.RED);
			 statusLabel2.setHorizontalAlignment(SwingConstants.CENTER);
			 statusLabel2.setBounds(250,90,130,16);	
			 add(statusLabel2);
		
	
		 JLabel readyLabel = new JLabel("Lobby", JLabel.RIGHT);
		 readyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 readyLabel.setBounds(183,30,96,16);	
		 add(readyLabel);
		 
		 
		 p1Button=new JLabel("Ready Player 1");
		 
		 p1Button.setHorizontalAlignment(SwingConstants.CENTER);
		 p1Button.setBounds(130,60,130,16);	
		 add(p1Button);
		 p2Button=new JLabel("Ready Player 2");
		
		 p2Button.setHorizontalAlignment(SwingConstants.CENTER);
		 p2Button.setBounds(130,90,130,16);	
		 add(p2Button);
		 
		 
		 
		JButton playButton = new JButton("Let's Play!");
		playButton.setBounds(12, 130, 150, 35);
		add(playButton);
		playButton.setPreferredSize(new Dimension(30,30));
		playButton.addActionListener(rc);
		
		JButton logout = new JButton("Log Out");
		logout.setBounds(288, 130, 150, 35);
		add(logout);
		logout.setPreferredSize(new Dimension(30,30));
		logout.addActionListener(rc);
		//addContact.setBounds(161, 168, 120, 50);
		
		this.add(inner);
	}
	
}


