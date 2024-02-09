package com.task.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeUtil {
	public static String url="jdbc:mysql://localhost:3306/employee";
	public static String username="root";
	public static String password="rote";
	public static Connection con;
	public static Connection getDBConnection() throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		return con;	
	}
	
    public static void getDBDestroyConnection() throws SQLException {
        con.close();
    }
}
