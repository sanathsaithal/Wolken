package com.wolken.markette;
import java.util.*;

import com.wolken.markette.dao.MarketDetailsDAO;
import com.wolken.markette.dao.MarketDetailsDAOImpl;
import com.wolken.markette.entity.MarketDetails;

public class Tester {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
		{
		MarketDetailsDAO dao=new MarketDetailsDAOImpl();
		MarketDetails details=new MarketDetails();
		String ans;
		do {
			System.out.println("enter choice");
			System.out.println("1. save");
			System.out.println("2. getById");
			System.out.println("3. update");
			System.out.println("4. delete");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("enter id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter name");
				String name=sc.nextLine();
				System.out.println("enter location");
				String location=sc.nextLine();
				System.out.println("enter no of shops");
				int noOfShops=sc.nextInt();
				System.out.println("enter area");
				int area=sc.nextInt();
					
				details.setId(id);
				details.setName(name);
				details.setLocation(location);
				details.setNoOfShops(noOfShops);
				details.setArea(area);
				boolean check=dao.save(details);
				if(check)
					System.out.println("saved");
				else
					System.out.println("not saved");
			}
			else if(choice==2)
			{
				System.out.println("enter id");
				int id=sc.nextInt();
					
				dao.getByid(id);
			}
			else if(choice==3)
			{
				System.out.println("enter id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter name");
				String name=sc.nextLine();
				System.out.println("enter location");
				String location=sc.nextLine();
				System.out.println("enter no of shops");
				int noOfShops=sc.nextInt();
				System.out.println("enter area");
				int area=sc.nextInt();
					
				details.setId(id);
				details.setName(name);
				details.setLocation(location);
				details.setNoOfShops(noOfShops);
				details.setArea(area);
				boolean check=dao.update(details);
				if(check)
					System.out.println("saved");
				else
					System.out.println("not saved");
			}
			else if(choice==4)
			{
				System.out.println("enter id to delete");
				int id=sc.nextInt();
					
				details.setId(id);
				boolean check=dao.delete(details);
				if(check)
					System.out.println("deleted");
				else
					System.out.println("not deleted");
			}
			else if(choice==5)
			{
				List<MarketDetails> details1=dao.getDetails();
				for(MarketDetails MarketDetails1: details1)
				{
					System.out.println(MarketDetails1);
				}
			}
				
			sc.nextLine();
			System.out.println("do u want to continue");
			ans=sc.nextLine();
		}while(ans.equals("yes"));	
	}

}


