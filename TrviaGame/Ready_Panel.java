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

public class Ready_Panel extends JPanel {
	private JTextField usernameField;
	

	public Ready_Panel(CardLayout cl, JPanel container, ChatClient client)
	{
		JPanel inner = new JPanel( );
		inner.setLayout(cl);
		inner.setBounds(316,15,1,1);
		inner.setLayout(null);
		setLayout(null);
		readyControl rc=new readyControl(cl,container,client);
		
		JLabel welcomeLabel = new JLabel("Welcome to Trivial Pursuit!");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setBounds(140, 8, 180, 20);
		add(welcomeLabel);
		//logOut.setBounds(318, 168, 120, 50);
		
		//deleteContact.setSize(120, 50);
		
		//can be used to let the user know there are other users that are not ready yet
		JLabel statusLabel=new JLabel("");
		statusLabel.setForeground(Color.BLUE);
		 statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 statusLabel.setBounds(183,55,96,16);	
		 add(statusLabel);
		
	
		 JLabel readyLabel = new JLabel("Ready Up", JLabel.RIGHT);
		 readyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 readyLabel.setBounds(183,30,96,16);	
		 add(readyLabel);
		 
		 JCheckBox readyButton=new JCheckBox("Ready");
		 readyButton.setSelected(false);
		 readyButton.setHorizontalAlignment(SwingConstants.CENTER);
		 readyButton.setBounds(183,80,96,16);	
		 add(readyButton);
		 
		 
		 
		JButton playButton = new JButton("Let's Play!");
		playButton.setBounds(12, 115, 150, 35);
		add(playButton);
		playButton.setPreferredSize(new Dimension(30,30));
		playButton.addActionListener(rc);
		
		JButton logout = new JButton("Log Out");
		logout.setBounds(288, 113, 150, 35);
		add(logout);
		logout.setPreferredSize(new Dimension(30,30));
		logout.addActionListener(rc);
		//addContact.setBounds(161, 168, 120, 50);
		
		this.add(inner);
	}
	
}


