package com.Mypackage;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class Jdbc_con {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection cn =null;
System.out.println(cn);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tree","root","123456789");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tree","root","123456789");
if(cn!=null)
{
//Statement stmt=con.createStatement();
			System.out.println("connected");
System.out.println(cn);


}
else
{
System.out.println(" notconnected");
}



			//String sql ="insert into fruit values(56)";
			//stmt.executeUpdate(sql);
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			
		}
finally{
try{
cn.close();
}
catch(SQLException e)
{
e.printStackTrace();

	}

}
}
}

