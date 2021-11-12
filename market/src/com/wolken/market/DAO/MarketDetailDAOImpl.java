package com.wolken.market.DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wolken.market.DTO.MarketDetailsDTO;

public class MarketDetailDAOImpl implements MarketDetailDAO {

	@Override
	public boolean save(MarketDetailsDTO mdto) {
		boolean result =false;
		Connection connection=null;
		PreparedStatement statement=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","root","Sanaths@1997");
			statement=connection.prepareStatement("insert into marketDetails value(?,?,?,?)");
			statement.setInt(1,mdto.getId());
			statement.setString(2,mdto.getName());
			statement.setString(3,mdto.getLocation());
			statement.setInt(4,mdto.getNoOfShops());
			
			statement.execute();	
			if(result)
				return false;
			else
				return true;
		} 
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				connection.close();
				statement.close();
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return false;
	}

	@Override
	public boolean update(MarketDetailsDTO mdto)  {
		boolean result=false;
		Connection connection=null;
		PreparedStatement statement=null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","root","Sanaths@1997");
			statement=connection.prepareStatement("update marketDetails set noOfShops=? where name=?");
			statement.setInt(1, mdto.getNoOfShops());
			statement.setString(2,mdto.getName());
			statement.execute();
			if(result)
				return false;
			else
				return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				connection.close();
				statement.close();
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return false;
	}

	@Override
	public boolean getByLocation(String location) {
		boolean result=false;
		Connection connection=null;
		PreparedStatement statement=null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","root","Sanaths@1997");
			statement=connection.prepareStatement("select * from marketDetails where location=?");
			System.out.println(location);
			statement.setString(1, location);
			ResultSet set=statement.executeQuery();
			
			while(set.next())
			{
				
				int id=set.getInt(1);
				String name=set.getString(2);
				String loc=set.getString(3);
				int noOfShops=set.getInt(4);
				
				System.out.println(id+"\t"+name+"\t"+loc+"\t"+noOfShops);
			}
			if(result)
				return false;
			else
				return true;
		} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				connection.close();
				statement.close();
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}

	@Override
	public boolean getAll(MarketDetailsDTO mdto) {
		boolean result=false;
		Connection connection=null;
		PreparedStatement statement=null;
		try {
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","root","Sanaths@1997");
		statement=connection.prepareStatement("select * from marketDetails");
		ResultSet set=statement.executeQuery();
		
		while(set.next())
		{
			int id=set.getInt(1);
			String name=set.getString(2);
			String location=set.getString(3);
			int noOfShops=set.getInt(4);
			
			System.out.println(id+"\t"+name+"\t"+location+"\t"+noOfShops);
		}
		if(result)
			return false;
		else
			return true;
	} 
	catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	finally {
		try {
			connection.close();
			statement.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
		return false;
	}

	@Override
	public boolean deleteByName(MarketDetailsDTO mdto) {
		boolean result=false;
		Connection connection=null;
		PreparedStatement statement=null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","root","Sanaths@1997");
			statement=connection.prepareStatement("delete from marketDetails where name=?");
			statement.setString(1, mdto.getName());
			result=statement.execute();
			
			if(result)
				return false;
			else
				return true;
		} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				connection.close();
				statement.close();
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return false;
	}
}
