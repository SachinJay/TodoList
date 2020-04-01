package model;

import java.io.Serializable;

//This class is a java bean 
//Java beans have to follow three rules
//-All private fields
//-No argument constructor
//-Implements serializable
//And this class does all those things so it is a java bean

//Implements serializable so that the User object can be sent over streams
public class User implements Serializable
{
	/**
	 * Default
	 */
	private static final long serialVersionUID = 1L;
	
	//Fields that ought to be defined for a user
	//Just their name and login credentials basically
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	/**
	 * @return the userName
	 */
	public String getUserName()
	{
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	

}