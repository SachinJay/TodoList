package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Todo;
/**
 * Interface to make sure the dao implementes the CRUD operations
 * @author Sachin Devasahayam
 *
 */
public abstract class TodoDaoInterface
{
	
	/**
	 * Insert todo into database (C)
	 * @param todo
	 * @throws SQLException
	 */
	public abstract void insert(Todo todo) throws SQLException;
	
	/**
	 * selects and returns a todo from database (R)
	 * @param id
	 * @return
	 */
	public abstract Todo select(long id);
	
	/**
	 * Selects all todos (R)
	 * @return
	 */
	public abstract ArrayList<Todo> selectAll();
	
	/**
	 * updates a todo, so maybe a field changed or something, this updates it (U)
	 * @param todo
	 * @return
	 * @throws SQLException
	 */
	public abstract Boolean update(Todo todo) throws SQLException;
	
	/**
	 * deletes a todo (D)
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public abstract Boolean delete(long id) throws SQLException;
	
	//insert select selectall delete update

}
