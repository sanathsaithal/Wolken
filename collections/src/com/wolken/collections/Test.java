package com.wolken.collections;
import java.util.*;

public class Test {
	static Scanner sc=new Scanner(System.in);
	static TreeSet<Park> parks=new TreeSet();
	
	void save(Park park)
	{
		parks.add(park);
	}
	
	void getAll()
	{
		for(Park park: parks)
		{
			System.out.println(park.getName()+"\t"+park.getCity()+"\t"+park.getPool()+"\t"+park.getRide()+"\t"+park.getContact()+"\t"+park.getFood());
		}
	}
	
	void getByCity(String city)
	{
		for(Park park: parks)
		if(park.getCity()==city)
		{
			System.out.println(park.getName()+"\t"+park.getCity()+"\t"+park.getPool()+"\t"+park.getRide()+"\t"+park.getContact()+"\t"+park.getFood());
		}
	}
	
	void getByName(String name)
	{
		for(Park park: parks)
		{
			if(park.getName().equals(name))
			{
				System.out.println(park.getName()+"\t"+park.getCity()+"\t"+park.getPool()+"\t"+park.getRide()+"\t"+park.getContact()+"\t"+park.getFood());
			}
		}
	}
	
	boolean updateByName(String name)
	{
		for(Park park: parks)
		{
			if(park.getName().equals(name))
			{
				sc.nextLine();
				System.out.println("enter name");
				name=sc.nextLine();
				System.out.println("enter city");
				String city=sc.nextLine();
				System.out.println("enter no of pool");
				byte pool=sc.nextByte();
				System.out.println("enter no of rides");
				byte rides=sc.nextByte();
				sc.nextLine();
				System.out.println("enter food available");
				String food=sc.nextLine();
				System.out.println("enter contact info");
				long contact=sc.nextLong();
				
				park.setName(name);
				park.setCity(city);
				park.setPool(pool);
				park.setRide(rides);
				park.setFood(food);
				park.setContact(contact);
				
				//parks.set(parks.indexOf(park), park);
				return true;
			}
		}return false;
	}
	
	boolean updateByCity(String city)
	{
		for(Park park: parks)
		{
			
			if(park.getCity().equals(city))
			{
				sc.nextLine();
				System.out.println("enter name");
				String name=sc.nextLine();
				System.out.println("enter city");
				city=sc.nextLine();
				System.out.println("enter no of pool");
				byte pool=sc.nextByte();
				System.out.println("enter no of rides");
				byte rides=sc.nextByte();
				sc.nextLine();
				System.out.println("enter food available");
				String food=sc.nextLine();
				System.out.println("enter contact info");
				long contact=sc.nextLong();
				
				park.setName(name);
				park.setCity(city);
				park.setPool(pool);
				park.setRide(rides);
				park.setFood(food);
				park.setContact(contact);
				
				//parks.set(parks.indexOf(park), park);
				return true;
			}
		}return false;
	}
	
	boolean delete(String name)
	{
		for(Park park: parks)
		{
			if(park.getName().equals(name))
			{
				parks.remove(park);
				return true;
			}
		}return false;
	}
	
	boolean deleteAll()
	{
		for(Park park: parks)
		{
			parks.clear();
			return true;
		}
	return false;
	}
	
	public static void main(String[] args)
	{
		Test test=new Test();
		String ans;
		do {
			System.out.println("1. save");
			System.out.println("2. save all");
			System.out.println("3. display all");
			System.out.println("4. display by city");
			System.out.println("5. display by ratings");
			System.out.println("6. update by name");
			System.out.println("7. update by city");
			System.out.println("8. remove by name");
			System.out.println("9. remove all");
			System.out.println("enter choice");
			int choice=sc.nextInt();
			if(choice==1)
			{
				Park park=new Park();
				sc.nextLine();
				System.out.println("enter name");
				String name=sc.nextLine();
				System.out.println("enter city");
				String city=sc.nextLine();
				System.out.println("enter no of pool");
				byte pool=sc.nextByte();
				System.out.println("enter no of rides");
				byte rides=sc.nextByte();
				sc.nextLine();
				System.out.println("enter food available");
				String food=sc.nextLine();
				System.out.println("enter contact info");
				long contact=sc.nextLong();
				
				park.setName(name);
				park.setCity(city);
				park.setPool(pool);
				park.setRide(rides);
				park.setFood(food);
				park.setContact(contact);
				test.save(park);
				
			}
			else if(choice==2)
			{
				TreeSet<Park> ll = new TreeSet<>();
				System.out.println("enter no of parks to add");
				byte no=sc.nextByte();
				for(int i=0;i<no;i++)
				{
					Park park=new Park();
					sc.nextLine();
					System.out.println("enter name");
					String name=sc.nextLine();
					System.out.println("enter city");
					String city=sc.nextLine();
					System.out.println("enter no of pool");
					byte pool=sc.nextByte();
					System.out.println("enter no of rides");
					byte rides=sc.nextByte();
					sc.nextLine();
					System.out.println("enter food available");
					String food=sc.nextLine();
					System.out.println("enter contact info");
					long contact=sc.nextLong();
					
					park.setName(name);
					park.setCity(city);
					park.setPool(pool);
					park.setRide(rides);
					park.setFood(food);
					park.setContact(contact);
					test.save(park);
				}
			}
			
			else if(choice==3)
			{
				test.getAll();
			}
			
			else if(choice==4)
			{
				sc.nextLine();
				System.out.println("enter city to serach");
				String city=sc.nextLine();
				test.getByCity(city);
			}
			
			else if(choice==5)
			{
				sc.nextLine();
				System.out.println("enter gun name to search");
				String name=sc.nextLine();
				test.getByName(name);
			}
			
			else if(choice==6)
			{
				sc.nextLine();
				System.out.println("enter gun name to update");
				String name=sc.nextLine();
				test.updateByName(name);
				boolean check=test.updateByName(name);
				if(check) {
					System.out.println("updated");
				}
				else {
					System.out.println("not updated");
				}
			}
			
			else if(choice==7)
			{
				sc.nextShort();
				System.out.println("enter city to update");
				String city=sc.nextLine();
				test.updateByCity(city);
				boolean check=test.updateByCity(city);
				if(check) {
					System.out.println("updated");
				}
				else {
					System.out.println("not updated");
				}
			}
			
			else if(choice==8)
			{
				sc.nextLine();
				System.out.println("enter gun name to remove"); 
				String name=sc.nextLine();
				boolean check=test.delete(name);
				if(check)
					System.out.println("deleted");
				else
					System.out.println("not deleted");
			}
			else if(choice==9)
			{
				test.deleteAll();
			}
			else
			{
				break;
			}
			sc.nextLine();
			System.out.println("do u want to continue? yes/no");
			ans=sc.nextLine();
		}while(ans.equals("yes"));
	}

	
	
}