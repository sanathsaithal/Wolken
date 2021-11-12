package com.wolken.collections;
import java.util.*;
public class Map {
	public static void main(String[] args)
	{
		System.out.println("HashMap");
		
		HashMap map=new HashMap();
		map.put(1,"sanath");
		map.put(2, "perdoor");
		map.put(3, 576124);
		map.put(4, 9108824170l);
		String s=(String)map.get(1);
		String s1=(String)map.get(2);
		int s2=(int) map.get(3);
		long s3=(long) map.get(4);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(map);
		map.remove(1);
		System.out.println(map.get(1));
		System.out.println(map);
		
		System.out.println("TreeMap");
		
		TreeMap tree=new TreeMap();
		tree.put(1,"sanath");
		tree.put(2, "perdoor");
		tree.put(3, 576124);
		tree.put(4, 9108824170l);
		String d=(String)tree.get(1);
		String d1=(String)tree.get(2);
		int d2=(int) tree.get(3);
		long d3=(long) tree.get(4);
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(tree);
		tree.remove(1);
		System.out.println(tree.get(1));
		System.out.println(tree);
		
		System.out.println("LinkedHashMap");
		
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(1,"sanath");
		lhm.put(2, "perdoor");
		lhm.put(3, 576124);
		lhm.put(4, 9108824170l);
		String f=(String)lhm.get(1);
		String f1=(String)lhm.get(2);
		int f2=(int) lhm.get(3);
		long f3=(long) lhm.get(4);
		System.out.println(f);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(lhm);
		lhm.remove(1);
		System.out.println(lhm.get(1));
		System.out.println(lhm);
		
	}
}
