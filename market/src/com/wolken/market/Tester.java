package com.wolken.market;

import com.wolken.market.DAO.MarketDetailDAO;
import com.wolken.market.DAO.MarketDetailDAOImpl;
import com.wolken.market.DTO.MarketDetailsDTO;
import java.util.*;


public class Tester {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		MarketDetailDAO dao=new MarketDetailDAOImpl();
		MarketDetailsDTO mdto=new MarketDetailsDTO();
		String ans;
		do {
			System.out.println("enter choice");
			System.out.println("1. save");
			System.out.println("2. Update noOfShops by Name");
			System.out.println("3. get by location");
			System.out.println("4. get all");
			System.out.println("5. delete by name");
			int choice=sc.nextInt();
			if(choice==1) {
				sc.nextLine();
				System.out.println("enter market id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter market name");
				String name=sc.nextLine();
				System.out.println("enter location");
				String location=sc.nextLine();
				System.out.println("enter no of shops");
				int noOfShops=sc.nextInt();
				
				mdto.setId(id);
				mdto.setName(name);
				mdto.setLocation(location);
				mdto.setNoOfShops(noOfShops);
				
			boolean check=dao.save(mdto);
			if(check)
				System.out.println("data saved");
			else
				System.out.println("not saved");
			}
			
			else if(choice==2)
			{
				sc.nextLine();
				System.out.println("enter market name to update");
				String name=sc.nextLine();
				System.out.println("enter new no of shops");
				int noOfShops=sc.nextInt();
				
				mdto.setName(name);
				mdto.setNoOfShops(noOfShops);
				
				boolean check=dao.update(mdto);
				if(check)
					System.out.println("updated");
				else
					System.out.println("not updated");
			}
			
			else if(choice==3)
			{
				sc.nextLine();
				System.out.println("enter location to search");
				String location=sc.nextLine();
				boolean check=dao.getByLocation(location);
				if(check)
					System.out.println("found");
				else
					System.out.println("not found");
			}
			
			else if(choice==4)
			{
				boolean check=dao.getAll(mdto);
			}
			
			else if(choice==5)
			{
				sc.nextLine();
				System.out.println("enter name to delete");
				String name=sc.nextLine();
				boolean check=dao.deleteByName(mdto);
				if(check)
					System.out.println("deleted");
				else
					System.out.println("not deleted");
			}
			
			sc.nextLine();
			System.out.println("do u want to continue");
			ans=sc.nextLine();
			}while(ans.equals("yes"));
				
		}
	
	}
	


