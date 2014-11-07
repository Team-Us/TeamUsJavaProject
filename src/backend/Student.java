package backend;

import java.util.ArrayList;

public class Student extends User
{

	private ArrayList<String> progress = new ArrayList<String>();
	
	
	public Student(String firstName, String lastName, String userName,
			int idNumber, String email, String password)
	{
		super(firstName, lastName, userName, idNumber, email, password);
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the progress
	 */
	public ArrayList<String> getProgress()
	{
		return progress;
	}


	/**
	 * @param progress the progress to set
	 */
	public void setProgress(String progress)
	{
		this.progress.add(progress);
	}
	
	

}
