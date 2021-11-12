package com.wolken.arraylist_linkedlist;

import java.util.*;

public class Main {
	static Scanner sc=new Scanner(System.in);
	static List<Gun> guns = new LinkedList();
	
	public static void main(String[] args)
	{
		Main main=new Main();
		String ans;
		do {
			System.out.println("1. save");
			System.out.println("2. save all");
			System.out.println("3. display all");
			System.out.println("4. display by range");
			System.out.println("5. display by name");
			System.out.println("6. update by name");
			System.out.println("7. update by model");
			System.out.println("8. remove by name");
			System.out.println("9. remove all");
			System.out.println("enter choice");
			int choice=sc.nextInt();
			if(choice==1)
			{
				Gun gun = new Gun();
				sc.nextLine();
				System.out.println("enter gun name");
				String name=sc.nextLine();
				System.out.println("enter gun model");
				String model=sc.nextLine();
				System.out.println("enter gun type");
				String type=sc.nextLine();
				System.out.println("enter gun price");
				float price=sc.nextFloat();
				System.out.println("enter bullets");
				int bullets=sc.nextInt();
				System.out.println("enter gun range");
				short range=sc.nextShort();
				
				gun.setName(name);
				gun.setModel(model);
				gun.setType(type);
				gun.setPrice(price);
				gun.setBullets(bullets);
				gun.setRange(range);
				main.save(gun);
			}
			else if(choice==2)
			{
				List<Gun> list = new ArrayList<>();
				System.out.println("enter the no of guns to add");
				int no=sc.nextInt();
				for(int i=0;i<no;i++)
				{
					Gun gun = new Gun();
					sc.nextLine();
					System.out.println("enter gun name");
					String name=sc.nextLine();
					System.out.println("enter gun model");
					String model=sc.nextLine();
					System.out.println("enter gun type");
					String type=sc.nextLine();
					System.out.println("enter gun price");
					float price=sc.nextFloat();
					System.out.println("enter bullets");
					int bullets=sc.nextInt();
					System.out.println("enter gun range");
					short range=sc.nextShort();
					
					gun.setName(name);
					gun.setModel(model);
					gun.setType(type);
					gun.setPrice(price);
					gun.setBullets(bullets);
					gun.setRange(range);
					list.add(gun);
				}
				main.saveAll(list);
			}
			else if(choice==3)
			{
				main.getAll();
			}
			else if(choice==4)
			{
				System.out.println("enter range to serach");
				short range=sc.nextShort();
				main.getByRange(range);
			}
			
			else if(choice==5)
			{
				sc.nextLine();
				System.out.println("enter gun name to search");
				String name=sc.nextLine();
				main.getByName(name);
			}
			
			else if(choice==6)
			{
				sc.nextLine();
				System.out.println("enter gun name to update");
				String name=sc.nextLine();
				main.updateByName(name);
				boolean check=main.updateByName(name);
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
				System.out.println("enter range to update");
				short range=sc.nextShort();
				main.updateByRange(range);
				boolean check=main.updateByRange(range);
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
				boolean check=main.delete(name);
				if(check)
					System.out.println("deleted");
				else
					System.out.println("not deleted");
			}
			else if(choice==9)
			{
				main.deleteAll();
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
	
	void save(Gun gun)
	{
		guns.add(gun);
	}
	
	void saveAll(List<Gun> list)
	{
		guns.addAll(list);
	}
	
	void getAll()
	{
		for(Gun gun: guns)
		{
			System.out.println(gun.getName()+"\t"+gun.getModel()+"\t"+gun.getType()+"\t"+gun.getPrice()+"\t"+gun.getBullets()+"\t"+gun.getRange());
		}
	}
	
	void getByRange(short range)
	{
		for(Gun gun : guns)
		if(gun.getRange()==range)
		{
			System.out.println(gun.getName()+"\t"+gun.getModel()+"\t"+gun.getType()+"\t"+gun.getPrice()+"\t"+gun.getBullets()+"\t"+gun.getRange());
		}
	}
	
	void getByName(String name)
	{
		for(Gun gun:guns)
		{
			if(gun.getName().equals(name))
			{
				System.out.println(gun.getName()+"\t"+gun.getModel()+"\t"+gun.getType()+"\t"+gun.getPrice()+"\t"+gun.getBullets()+"\t"+gun.getRange());
			}
		}
	}
	
	boolean updateByName(String name)
	{
		for(Gun gun:guns)
		{
			if(gun.getName().equals(name))
			{
				sc.nextLine();
				System.out.println("enter gun name");
				name=sc.nextLine();
				System.out.println("enter gun model");
				String model=sc.nextLine();
				System.out.println("enter gun type");
				String type=sc.nextLine();
				System.out.println("enter gun price");
				float price=sc.nextFloat();
				System.out.println("enter bullets");
				int bullets=sc.nextInt();
				System.out.println("enter gun range");
				short range=sc.nextShort();
				
				gun.setName(name);
				gun.setModel(model);
				gun.setType(type);
				gun.setPrice(price);
				gun.setBullets(bullets);
				gun.setRange(range);
				guns.set(guns.indexOf(gun), gun);
				return true;
			}
		}return false;
	}
	
	boolean updateByRange(Short range)
	{
		for(Gun gun:guns)
		{
			if(gun.getRange()==range)
			{
				sc.nextLine();
				System.out.println("enter gun name");
				String name=sc.nextLine();
				System.out.println("enter gun model");
				String model=sc.nextLine();
				System.out.println("enter gun type");
				String type=sc.nextLine();
				System.out.println("enter gun price");
				float price=sc.nextFloat();
				System.out.println("enter bullets");
				int bullets=sc.nextInt();
				System.out.println("enter gun range");
				range=sc.nextShort();
				
				gun.setName(name);
				gun.setModel(model);
				gun.setType(type);
				gun.setPrice(price);
				gun.setBullets(bullets);
				gun.setRange(range);
				guns.set(guns.indexOf(gun), gun);
				return true;
			}
		}return false;
	}
	
	boolean delete(String name)
	{
		for(Gun gun:guns)
		{
			if(gun.getName().equals(name))
			{
				guns.remove(gun);
				return true;
			}
		}return false;
	}
	
	boolean deleteAll()
	{
		for(Gun gun:guns)
		{
			guns.clear();
			return true;
		}
	return false;
	}
}