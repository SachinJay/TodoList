package utils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

//Class with some convenience methods

public class JDBCUtils
{
	private static String url = "jdbc:mysql://localhost:3306/todo_db";
	private static String user = "root";
	private static String pass = "y%4lHP$3v0b1%#EJl3BAFuAAeT&T";

	public static Connection getConnection() throws ClassNotFoundException
	{
		Connection connection = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, pass);
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		} 
		return connection;
	}

	public static void printSQLException(SQLException ex)
	{
		for (Throwable e : ex)
		{
			if (e instanceof SQLException)
			{
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null)
				{
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
	
	public static Date getSQLDate(LocalDate date)
	{
		return Date.valueOf(date);
	}

	public static LocalDate getUtilDate(Date sqlDate)
	{
		return sqlDate.toLocalDate();
	}

}
