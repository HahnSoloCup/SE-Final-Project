/*package TriviaGame;

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
	JLabel questionLabel;
	JRadioButton choice1;
	JRadioButton choice2;
	JRadioButton choice3;
	
	
//	public void setQData(QuestionData QD)
//	  {
////	    questionLabel.setText(QD.question);
////		String a="A)";
////		String b="B)";
////		String c="C)";
////	    choice1.setText(a+QD.  );
////	    choice2.setText(b+QD.  );
////	    choice3.setText(c+QD. );
//	  }
	

	public QuestionsPanel(QuestionsControl qs)
	{
		
		JPanel inner = new JPanel( );
		inner.setBounds(316,15,1,1);
		inner.setLayout(null);
		setLayout(null);
	
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
		questionArea.setText("Question");
		
		choice1=new JRadioButton("A)Answer");
		choice2=new JRadioButton("B)Answer");
		choice3=new JRadioButton("C)Answer");
		
		choice1.addActionListener(qs);
		choice2.addActionListener(qs);
		choice3.addActionListener(qs);
	
		
		choice1.setBounds(12,60,200,63);
		choice2.setBounds(12,80,200,63);
		choice3.setBounds(12,100,200,63);
		ButtonGroup group = new ButtonGroup();
		group.add(choice1);
		group.add(choice2);
		group.add(choice3);
	
		setLayout(new GridLayout(0,1));
		add(choice1);
		add(choice2);
		add(choice3);
		
	
		
		
		
		 
		 
		JButton submit = new JButton("Submit answer");
		submit.setBounds(12, 200, 150, 35);
		add(submit);
		submit.setPreferredSize(new Dimension(30,30));
		submit.addActionListener(qs);
	
		JButton logout = new JButton("Quit");
		logout.setBounds(288, 200, 150, 35);
		add(logout);
		logout.setPreferredSize(new Dimension(30,30));
		logout.addActionListener(qs);
		//addContact.setBounds(161, 168, 120, 50);
		
		this.add(inner);
		
	}
	
}

*/
