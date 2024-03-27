package com.javaJdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection 
{
	
	//database credentials
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL= "jdbc:mysql://localhost:3306/product_db";
	private static final String DATABASE_USERNAME = "root";
	private static final String DATABASE_PASSWORD = "DeV@1990";
	

	public static Connection getDBConnection()
	{
		
		Connection connection = null;
		
		try
		{
			//step1: load/register with driver
			Class.forName(DRIVER_NAME);
			
			//step2: create connection object
			connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
			
			
		}
		catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return connection;
		
	}
	
}
