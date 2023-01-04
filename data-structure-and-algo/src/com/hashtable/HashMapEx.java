package com.hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		Emp e1=new Emp(121,"jane","jones");
		Emp e2=new Emp(131,"john","scena");
		Emp e3=new Emp(141,"mayami","alvar");
		Emp e4=new Emp(151,"ram","charan");
		Emp e5=new Emp(161,"mary","smith");
		Emp e6=new Emp(171,"mike","wilson");
		
		Map <String ,Emp> hashmap=new HashMap<String,Emp>();
		
		hashmap.put("jane", e6);
		hashmap.put("john", e5);
		hashmap.put("mayami", e4);
		hashmap.put("ram", e3);
		hashmap.put("mary", e2);
		hashmap.put("mike", e1);
		
		/*
		Iterator <Emp> iterator=hashmap.values().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		*/
		
		hashmap.forEach((k,v) -> System.out.println("Key: "+ k + "    Employee: "+ v));
		
		System.out.println(hashmap.containsKey("mary"));
		System.out.println(hashmap.containsValue(e6));
		
		Emp e=hashmap.putIfAbsent("jenny", new Emp(181,"jenny","juju"));
		//System.out.println(e);
		
		hashmap.forEach((k,v) -> System.out.println("Key: "+ k + "    Employee: "+ v));
		
	}

}
