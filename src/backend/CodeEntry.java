package backend;

public class CodeEntry extends Exercise
{
	private String userInput;
	private String question;
	
	/**
	 * @return the question
	 */
	public String getQuestion()
	{
		return question;
	}
	
	/**
	 * Resets the users input
	 */
	public void resetUserInput()
	{
		userInput = null;
	}
	
}
