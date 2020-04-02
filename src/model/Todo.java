package model;

import java.time.LocalDate;

/**
 * Class to represent a Todo object
 * @author Sachin Devasahayam
 *
 */

public class Todo
{
	private String title; 
	private String description;
	private LocalDate goalDate;
	private String username;
	private Boolean isDone;
	private long id;
	
	/**
	 * Constructor without id
	 * @param title the title of the todo
	 * @param description the description of the todo
	 * @param goalDate the goal to finish the todo by
	 * @param username the username of the person associated with the Todo
	 * @param isDone whether or not the todo is done
	 */
	public Todo(String title, String description, LocalDate goalDate, String username, Boolean isDone)
	{
		this.title = title;
		this.description = description;
		this.goalDate = goalDate;
		this.username = username;
		this.isDone = isDone;
	}
	
	/**
	 * Constructor with id
	 * @param title the title of the todo
	 * @param description the description of the todo
	 * @param goalDate the goal to finish the todo by
	 * @param username the username of the person associated with the Todo
	 * @param isDone whether or not the todo is done
	 * @param id the id number associated with the Todo object
	 */
	public Todo(String title, String description, LocalDate goalDate, String username, Boolean isDone, long id)
	{
		this.title = title;
		this.description = description;
		this.goalDate = goalDate;
		this.username = username;
		this.isDone = isDone;
		this.id = id;
	}
	
	
	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
	/**
	 * @return the goalDate
	 */
	public LocalDate getGoalDate()
	{
		return goalDate;
	}
	/**
	 * @param goalDate the goalDate to set
	 */
	public void setGoalDate(LocalDate goalDate)
	{
		this.goalDate = goalDate;
	}
	/**
	 * @return the username
	 */
	public String getUsername()
	{
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}
	/**
	 * @return the isDone
	 */
	public Boolean getIsDone()
	{
		return isDone;
	}
	/**
	 * @param isDone the isDone to set
	 */
	public void setIsDone(Boolean isDone)
	{
		this.isDone = isDone;
	}
	/**
	 * @return the id
	 */
	public long getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id)
	{
		this.id = id;
	}

}
