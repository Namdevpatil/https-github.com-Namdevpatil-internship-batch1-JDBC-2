package com.javaJdbcConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchProducts 
{
	
	
	public static void main(String[] args) throws SQLException
	{
		
		Connection connection = null;
		
		try
		{
			
			connection = DatabaseConnection.getDBConnection();
						
			String query = "select * from product";
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(query);
			
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1)+" | "+resultSet.getString(2)+" | "+resultSet.getDouble(3));
				System.out.println("---------------------------------------------------------------------------");
			}
			
			
		}
		catch (Exception e) {
		
			e.printStackTrace();
		}
		finally {
			connection.close();
		}
		
		
		
	}
	
}
