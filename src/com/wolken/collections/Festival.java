package com.wolken.collections;
import java.util.*;
public class Festival {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		/*FestivalInfo fi=new FestivalInfo();
		sc.nextLine();
		System.out.println("enter festival name");
		String name=sc.nextLine();
		System.out.println("enter date");
		String date=sc.nextLine();
		System.out.println("enter specification");
		String specification=sc.nextLine();
		System.out.println("enter no of days");
		byte noOfDays=sc.nextByte();
		fi.setName(name);
		fi.setDate(date);
		fi.setSpecification(specification);
		fi.setNoOfDays(noOfDays);*/
		
		ArrayList a=new ArrayList();
		a.add("sanath");
		a.add("sanathsaithal@gmail.com");
		a.add("perdoor");
		a.add(9108824170l);
		System.out.println("ADD");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		ArrayList a1=new ArrayList();
		a1.add("sam");
		a1.add("sam@gmail.com");
		a1.add("perdoor");
		a1.add(9481847552l);
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		a.addAll(a1);
		
		System.out.println("ADD ALL");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("IS EMPTY");
		System.out.println(a.isEmpty());
		
		System.out.println("CONTAINS ALL");
		System.out.println(a.containsAll(a1));
		
		System.out.println("INDEX OF");
		System.out.println(a.indexOf("perdoor"));
		
		/*System.out.println("LAST INDEX OF");
		System.out.println(a.lastIndexOf("sanath"));*/
		
		a.set(0, "mamatha");
		System.out.println("after setting index");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		a.remove(2);
		System.out.println("after removing 2nd index");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("CONTAINS");
		System.out.println(a.contains("sanath"));
		
		
		
		a.removeAll(a1);
		System.out.println("REMOVE ALL");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		/*a.clear();
		System.out.println("after clearing");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}*/
	}

}
