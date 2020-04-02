package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import model.Login;
import utils.JDBCUtils;

/**Used to verify that a login is valid by getting the corresponding user from the database*/

public class LoginDao
{
	/**
	 * Queries DB to see if such a user exists, if so returns true, else false
	 * @param log the login credentials
	 * @return true if login credentials matches a user in the DB
	 * @throws ClassNotFoundException
	 */
	public boolean login(Login log) throws ClassNotFoundException
	{
		Boolean isValidLogin = false;
		
			
		Connection connection = JDBCUtils.getConnection();
		
		String sqlCom = "SELECT * FROM users WHERE username = ? AND password = ? ";
		
		//Using connection object, make a SQL command
		try
		{
			PreparedStatement ps = connection.prepareStatement(sqlCom);
			ps.setString(1, log.getUsername());
			ps.setString(2, log.getPassword());
			
			System.out.println(ps);
			
			//Executes query and returns whatever the result is
			ResultSet rs = ps.executeQuery();
			
			//Basically, if any columns exist in the result, then the login was valid
			isValidLogin = rs.next();
		}
		catch (SQLException e)
		{
			JDBCUtils.printSQLException(e);			
		}
		
		return isValidLogin;
	}
}
