package TriviaGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QuestionData {
//houses question, answer, and users choice
	
	//string for question, string for correct answer, string for useranswer
	
	  private String Question;
	  private String Answer;
	  private String UserAnswer;
	  private String RightAnswer;
	  
	  
	  
	  
	  
	  // Getters for the username and password.
	  public String getQuestion()
	  {
	    return Question;
	  }
	  public String getAnswer()
	  {
	    return Answer;
	  }
	  public String getUserAnswer()
	  {
	    return UserAnswer;
	  }
	  public String getRightAnswer()
	  {
		  return RightAnswer;
	  }
	  
	  
	  // Setters for the username and password.
	  public void setQuestion(String Question)
	  {
	    this.Question = Question;
	  }
	  public void setAnswer(String Answer)
	  {
	    this.Answer = Answer;
	  }
	  public void setUserAnswer(String UserAnswer)
	  {
	    this.UserAnswer = UserAnswer;
	  }
	  public void setRightAnswer(String RightAnswer)
	  {
	    this.RightAnswer = RightAnswer;
	  }
	  

	 
	  
	  
	 
	  
	  
	  
	  // Constructor that initializes the username and password.
	  public QuestionData(String Question, String Answer, String UserAnswer, String RightAnswer)
	  {
	    setQuestion(Question);
	    setUserAnswer(UserAnswer);
	    setAnswer(Answer);
	    setRightAnswer(RightAnswer);
	  }
	
	 public QuestionData()
	 {
		 
		 
		 
	 }
	
}
