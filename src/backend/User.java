/**
 * 
 */
package backend;

/**
 * @author prestonhaynes
 *
 */
public abstract class User
{
	private String firstName;
	private String lastName;
	private String userName;
	private int idNumber;
	private String email;
	private String password = "";
	/** passwordRegexString allows alphanumberic and "! # $ * % ^ &"  characters.
	 *  8-36 characters for password.
	 *  Public so that it can be access from other classes.
	 *  Final so it cannot be changed by other classes **/
	public final String passwordRegexString = "^[a-zA-Z0-9!#$*%^&]{8,36}$"; 
	

	/**
	 * @param firstName
	 * @param lastName
	 * @param userName
	 */
	public User(String firstName, String lastName, String userName,
			int idNumber, String email, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.idNumber = idNumber;
		this.email = email;
		this.password = password;
		
	}

	/**
	 * @param newPassword the password to set
	 */
	public boolean setPassword(String newPassword, String oldPassword)
	{
		if(checkPassword(oldPassword)
				&& newPassword.length() >= 6
				&& newPassword.length() <= 24
				&& !newPassword.matches(passwordRegexString))
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return String.format("/d:/s /s", idNumber, firstName, lastName);
	}
	
}
