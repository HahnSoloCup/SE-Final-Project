package TriviaGame;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ocsf.client.AbstractClient;

public class TriviaClient extends AbstractClient
{
	//correspond to client gui
	private JLabel status;
	private JPanel container;
	private JTextArea log;
	private CardLayout cl;
	private Object serverMsg;

	//constructor
	public TriviaClient()
	{
		super("localhost", 8300);
		status = new JLabel();
		container = new JPanel();
		log = new JTextArea();
		cl = new CardLayout();
	}

	//setter for status text field
	public void setStatus(JLabel status)
	{
		this.status = status;
	}
	
	//setter for container
	public void setContainer(JPanel container)
	{
		this.container = container;
	}
	
	//setter for log
	public void setLog(JTextArea log)
	{
		this.log = log;
	}
	
	//setter for card layout
	public void setCardLayout(CardLayout cl)
	{
		this.cl = cl;
	}
	
	//slot method
	protected void handleMessageFromServer(Object arg0)
	{
		serverMsg = arg0;
	}
	
	//hook method
	public void connectionException (Throwable exception)
	{
		status.setText("Connection Exception Occurred");
		status.setForeground(Color.RED);
		log.append(exception.getMessage());
		exception.printStackTrace();
	}
	
	//hook method
	public void connectionEstablished() 
	{
		status.setText("Client Connected");
		status.setForeground(Color.GREEN);	
	}

	public Object getServerMsg() {
		// TODO Auto-generated method stub
		return serverMsg;
	}

}