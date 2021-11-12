package com.wolken.jdbc;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class airport {
	
	public static void main(String[] args)
	{
		
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/airport","root","Sanaths@1997");
			statement=connection.createStatement();
		    ResultSet set=statement.executeQuery("select * from empDetails");
		    while(set.next())
		    {
		    	int eid=set.getInt(1);
		    	String name=set.getString(2);
		    	String designation=set.getString(3);
		    	int experience=set.getInt(4);
		    	int aId=set.getInt(5);
		    	System.out.println(eid+"\t\t"+name+"\t\t"+designation+"\t\t"+experience+"\t\\t"+aId);
		    	
		    }
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			try {
				statement.close();
				connection.close();
			}
			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
