package TriviaGame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;

public class LoginPanel extends JPanel
{
  private JTextField username;
  private JTextField password;
  private JLabel errorMsg;
  
  public void setErrorMsg(String error)
  {
	  errorMsg.setText(error);
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
    
    JPanel inner = new JPanel(new GridLayout(6,2));
    
    JLabel jlabel = new JLabel("Login",JLabel.CENTER);
    
    username = new JTextField(15);
    password = new JPasswordField(15);
    JButton submit = new JButton("Submit");
    submit.setPreferredSize(new Dimension(30,30));
    
    submit.addActionListener(lc);
    
   
    
    JButton createAccount = new JButton("Create Account");
    createAccount.setPreferredSize(new Dimension(30,30));
    createAccount.addActionListener(lc);
    
    errorMsg = new JLabel("",JLabel.CENTER);
    errorMsg.setForeground(Color.red);
    
    inner.add(jlabel);
    inner.add(username);
    inner.add(password);
    inner.add(submit);
    inner.add(createAccount);

    this.add(inner);    
  }
}
