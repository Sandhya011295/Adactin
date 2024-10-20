package com.utility;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDBC_Connector {
	static String fname;
	private static String getParticularData() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/employees";
		String username = "root";
		String passWord ="ranjani@123";
		String query = "SELECT * FROM employees limit 10";
		
		//Connection Estabilize
		Connection connection=DriverManager.getConnection(url, username, passWord);
		
		//Create statement
		Statement statement =connection.createStatement();
		
		//Execute Query
		ResultSet result =statement.executeQuery(query);
		while(result.next()) {
		 fname = result.getString(3);
		System.out.println(fname);
		}
		return fname;
	
	}
	public static void main(String[] args) throws SQLException {
		String fname=getParticularData();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(fname);
	}
	
}
