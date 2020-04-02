package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.User;
import utils.JDBCUtils;

public class UserDao
{
	public int registerUser(User user) throws ClassNotFoundException
	{
		String insert_users_query = "INSERT INTO users (first_name, last_name, username, password)"
				+ " VALUES (?, ?, ?, ?);";
		int result = 0; 
		
		Connection connection = JDBCUtils.getConnection();
		
		try
		{
			PreparedStatement ps = connection.prepareStatement(insert_users_query);
			
			//Replaces the wildcards we had before
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getUserName());
			ps.setString(4, user.getPassword());
			
			System.out.println(ps);
			
			result = ps.executeUpdate();
		} catch (SQLException e)
		{
			JDBCUtils.printSQLException(e);
		}
		
		return result;
	}

}
