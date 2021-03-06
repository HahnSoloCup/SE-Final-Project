package ClientCommunication;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

@SuppressWarnings("serial")
public class LoginPanel extends JPanel
{
  private JTextField username;
  private JTextField password;
  private JLabel errorMsg;
  private JButton submit;
  private JButton createAccount;
  
  public void setErrorMsg(String error)
  {
	  errorMsg.setText(error);
	  errorMsg.setForeground(Color.black);
  }
  
  public void hideButtons() {
	  submit.setVisible(false);
	  createAccount.setVisible(false);
  }
  
  public String getUserName()
  {
    return username.getText(); //getText deprecated
  }
  
  public String getPassword()
  {
    return password.getText(); //
  }
  
  public LoginPanel(LoginControl lc)
  {
	JPanel inner = new JPanel(new GridLayout(6, 1, 5, 5));
    JLabel jlabel = new JLabel("Login",JLabel.CENTER);
    
    username = new JTextField(15);
    password = new JTextField(15);
    
    submit = new JButton("Submit");
    submit.setPreferredSize(new Dimension(20,20));
    submit.addActionListener(lc);
    
    createAccount = new JButton("Create Account");
    createAccount.setPreferredSize(new Dimension(30,30));
    createAccount.addActionListener(lc);
    
    errorMsg = new JLabel("",JLabel.CENTER);
    errorMsg.setForeground(Color.red);
    
    inner.add(jlabel);
    inner.add(errorMsg);
    inner.add(username);
    inner.add(password);
    inner.add(submit);
    inner.add(createAccount);
    

    this.add(inner);    
  }
}
