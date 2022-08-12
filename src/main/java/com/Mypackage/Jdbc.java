package com.Mypackage;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tree","root","123456789");
			Statement stmt=con.createStatement();
			System.out.println("inserting records");
			String sql ="insert into fruit values(100)";
			stmt.executeUpdate(sql);
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}

}
