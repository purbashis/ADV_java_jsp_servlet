package com.Mypackage;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection cn =null;
Statement st=null;

System.out.println(cn);
int id =12;
String name="ismel";
int age =40;
String address ="bbsr";
int marks =90;


		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tree","root","123456789");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456789");
if(cn!=null)
{
	st=cn.createStatement();
//Statement stmt=con.createStatement();
			System.out.println("connected");
System.out.println(st);
int i = st.executeUpdate("insert into st (id,name,age,address,marks)values(' "+id+" ',' "+name+" ',' "+age+" ',' "+address+" ','"+marks+"')");
System.out.println(i);
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

