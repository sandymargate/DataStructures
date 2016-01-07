package com.selenium.OrangeHRM.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String dbUrl = "jdbc:mysql://127.0.0.1:3306/emp";
		String username = "root";
		String password = "pramati@123";
		String query = "select * from employee;";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = (Statement) con.createStatement();
		ResultSet result = (ResultSet) stmt.executeQuery(query);
		System.out.println(result);
		while(result.next())
		{
			System.out.println(result.getString("Name"));
			System.out.println(result.getInt("Age"));
			
		}
	}

}
