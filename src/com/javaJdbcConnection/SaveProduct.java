package com.javaJdbcConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveProduct 
{
	
	
	public static void main(String[] args) throws SQLException
	{
		
		Connection connection = null;
		
		try
		{
			
			connection = DatabaseConnection.getDBConnection();
			
			//Product product = new Product(1100, "Lenovo Laptop T430 model", 59029.34);
			//Product product = new Product(2211, "Lenovo Laptop T564 model", 120922.34);
			//Product product = new Product(1133, "Dell Laptop D554 model", 89474.45);
			Product product = new Product(4756, "HP Laptop T444 model", 79029.34);
			
			String query = "insert into product(product_id, product_name, product_price) values('"+product.getProductId()+"','"+product.getProductName()+"','"+product.getProductPrice()+"')";
			Statement statement = connection.createStatement();
			
			int status = statement.executeUpdate(query);
			
			System.out.println(status+" product object stored in database table.");
			
		}
		catch (Exception e) {
		
			e.printStackTrace();
		}
		finally {
			connection.close();
		}
		
		
		
	}
	
}
