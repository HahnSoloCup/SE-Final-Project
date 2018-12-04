package ClientCommunication;

import java.io.Serializable;

public class CreateAccountData implements Serializable
{
	private String username;
	private String password;
	private String repassword;
	 
	  public String getUserName()
	  {
	    return username;
	  }
	  
	  public String getPassword()
	  {
	    return password;
	  }
	  
	  public String getRePassword()
	  {
		  return repassword;
	  }	  
	  
	  public CreateAccountData(String username, String password, String repassword)
	  {
		this.username = username;  
		this.password = password;
		this.repassword = repassword;
	  }
}
