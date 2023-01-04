package com.hashtable;

import com.list.Employee;

public class SimpleHashtableExample {

	public static void main(String[] args) {
		
		Emp e1=new Emp(121,"jane","jones");
		Emp e2=new Emp(131,"john","scena");
		Emp e3=new Emp(141,"mayami","alvar");
		Emp e4=new Emp(151,"ram","charan");
		Emp e5=new Emp(161,"mary","smith");
		Emp e6=new Emp(171,"mike","wilson");
		
		SimpleHashtable ht=new SimpleHashtable();
		
		ht.put("mike", e6);
		ht.put("mary",e5);
		ht.put("ram", e4);
		ht.put("mayami", e3);
		ht.put("john", e2);
		ht.put("jane", e1);
		
		ht.printHashtable();
		

	}

}
