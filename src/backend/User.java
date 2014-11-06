/**
 * 
 */
package backend;

import java.util.ArrayList;

/**
 * @author prestonhaynes
 *
 */
public class User
{
	private String firstName;
	private String lastName;
	private String userName;
	private int idNumber;
	private ArrayList<String> progress = new ArrayList<String>();
	private String email;
	private String password = "";
	public final String passwordRegexString = "^"; //TODO Working Regex string for password


	/**
	 * @param firstName
	 * @param lastName
	 * @param userName
	 * @param idNumber
	 * @param email
	 * @param password
	 */
	public User(String firstName, String lastName, String userName,
			int idNumber, String email, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.idNumber = idNumber;
		this.email = email;
		setPassword(password, "");
		
	}

	/**
	 * @param newPassword the password to set
	 */
	public boolean setPassword(String newPassword, String oldPassword)
	{
		if(checkPassword(oldPassword)
				&& newPassword.length() >= 6
				&& newPassword.length() <= 24
				)//&& !newPassword.matches(passwordRegexString))
		{
			this.password = newPassword;
			return true;
		}
		return false;
	}

	private boolean checkPassword(String password)
	{
		return (this.password.compareTo(password) == 0);
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * @return the idNumber
	 */
	public int getIdNumber()
	{
		return idNumber;
	}

	/**
	 * @return the progress
	 */
	public ArrayList<String> getProgress()
	{
		return progress;
	}

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public boolean setUserName(String userName)
	{
		this.userName = userName;
		// TODO implement username check
		return true;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public boolean setEmail(String email)
	{

		if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)"
				+ "*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
		{
			this.email = email;
			return true;
		} else
			return false;
	}

}
