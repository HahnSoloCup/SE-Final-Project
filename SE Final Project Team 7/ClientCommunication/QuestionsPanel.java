package ClientCommunication;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import java.awt.*;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class QuestionsPanel extends JPanel {
	JLabel questionLabel;
	JTextArea questionArea;
	JRadioButton choice1;
	JRadioButton choice2;
	JRadioButton choice3;
	ButtonGroup group;
	
	public void setQData(QuestionData QD) {	 
		questionArea.setText(QD.getQuestion());
	    choice1.setText(QD.getAnswer().get(0));
	    choice2.setText(QD.getAnswer().get(1));
		choice3.setText(QD.getAnswer().get(2));
		group.clearSelection();
	  }
	
	public void setQLabel(String QL) {
		questionLabel.setText(QL);
	}
	
	public QuestionsPanel(QuestionsControl qs) {
		 this.setPreferredSize(new Dimension(800,600));
		    
		    JPanel north = new JPanel(new FlowLayout());

		    questionLabel=new JLabel ("Choose the Best Answer:");
		    questionArea=new JTextArea();
		    north.add(questionLabel);
		    
		    JPanel center = new JPanel(new GridBagLayout());
		    GridBagConstraints c = new GridBagConstraints();
		    c.gridx = 0;
		    c.gridy = 0;
		    c.weighty = .3;
		    c.fill = GridBagConstraints.NORTH;
		    c.insets = new Insets(0,1,0,20);
		    questionArea = new JTextArea(2,40);
		    JScrollPane lPane = new JScrollPane(questionArea);
		    questionArea.setText("Why did king arthur pull out the sword?");
		    questionArea.setEditable(false);
		    center.add(lPane,c);
		    
		    choice1=new JRadioButton("A)Answer");
		    choice2=new JRadioButton("B)Answer");
			choice3=new JRadioButton("C)Answer");
			
			group = new ButtonGroup();
			group.add(choice1);
			group.add(choice2);
			group.add(choice3);
			
			c.fill = GridBagConstraints.NONE;
		    c.gridx = 0;
		    c.gridy = 1;
		    c.anchor = GridBagConstraints.LINE_START;
		    c.insets = new Insets(0,0,5,5);
		    c.weightx = 0.5;
		    c.weighty = 0.05;
		    choice1.setHorizontalAlignment(JLabel.LEFT);
			center.add(choice1,c);
			
			 c.gridx = 0;
			    c.gridy = 2;
			   c.anchor = GridBagConstraints.LINE_START;
			center.add(choice2,c);
			 c.gridx = 0;
			    c.gridy = 3;
			    c.anchor = GridBagConstraints.LINE_START;
			center.add(choice3,c);
		    
		    JPanel south = new JPanel(new FlowLayout());
		    
		    JButton submit = new JButton("Submit Answer");
		    south.add(submit,c);
		    
		    
		   
			choice1.addActionListener(qs);
		choice2.addActionListener(qs);
		choice3.addActionListener(qs);
		    submit.addActionListener(qs);
		   
		
		   
		 
		    
		    
		    this.setLayout(new BorderLayout());
		    this.add(north,BorderLayout.NORTH);
		    this.add(center, BorderLayout.CENTER);
		    this.add(south,BorderLayout.SOUTH);
		    
		
	}
	
}
