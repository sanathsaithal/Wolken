package com.wolken.linkedlist;
import java.util.*;
public class TestLinked {
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		
		ll.add("sanath");
		ll.add("sanathsaithal@gmail.com");
		ll.add("perdoor");
		ll.add(9108824170l);
		for(int i=0;i<ll.size();i++)
		{
		System.out.println(ll.get(i));
		}
		
		LinkedList ll1=new LinkedList();
		
		ll1.add("mamatha");
		ll1.add("mamatha@gmail.com");
		ll1.add("perdoor");
		ll1.add(9481847552l);
		for(int i=0;i<ll1.size();i++)
		{
		System.out.println(ll1.get(i));
		}
		
		ll.add(0, "sam");
		for(int i=0;i<ll.size();i++)
		{
		System.out.println(ll.get(i));
		}
		
		ll.addFirst(ll1);
		System.out.println("add first");
		for(int i=0;i<ll.size();i++)
		{
		System.out.println(ll.get(i));
		}
		
		ll.addLast(ll1);
		System.out.println("add last");
		for(int i=0;i<ll.size();i++)
		{
		System.out.println(ll.get(i));
		}
		
		System.out.println("PEEK");
		System.out.println(ll.peek());
		
		System.out.println("PEEK First");
		System.out.println(ll.peekFirst());
		
		System.out.println("PEEK Last");
		System.out.println(ll.peekLast());
		
		System.out.println("REMOVE FIRST");
		System.out.println(ll.removeFirst());
		System.out.println(" AFTER REMOVE FIRST");
		for(int i=0;i<ll.size();i++)
		{
		System.out.println(ll.get(i));
		}
		
		System.out.println("REMOVE LAST");
		System.out.println(ll.removeLast());
		System.out.println(" AFTER REMOVE LAST");
		for(int i=0;i<ll.size();i++)
		{
		System.out.println(ll.get(i));
		}
		
		System.out.println(" AFTER PUSH");
		ll.push(ll1);
		for(int i=0;i<ll.size();i++)
		{
		System.out.println(ll.get(i));
		}
		
		System.out.println(" AFTER POP");
		ll.pop();
		for(int i=0;i<ll.size();i++)
		{
		System.out.println(ll.get(i));
		}
	}
	

}
