package com.hashtable;

public class ChainedHashtableEx {
	
public static void main(String[] args) {
		
		Emp e1=new Emp(121,"jane","jones");
		Emp e2=new Emp(131,"john","scena");
		Emp e3=new Emp(141,"mayami","alvar");
		Emp e4=new Emp(151,"ram","charan");
		Emp e5=new Emp(161,"mary","smith");
		Emp e6=new Emp(171,"mike","wilson");
		
		ChainedHashtable ht=new ChainedHashtable();
		
		ht.put("mike", e6);
		ht.put("mary",e5);
		ht.put("ram", e4);
		ht.put("mayami", e3);
		ht.put("john", e2);
		ht.put("jane", e1);
		
		ht.printHashtable();
		
		System.out.println("Retrieve key mike "+ht.get("mike"));
		System.out.println("Retrieve key mary "+ht.get("mary"));
		

		System.out.println(" ");
		ht.remove("john");
//		ht.remove("mary");
		
		ht.printHashtable();
	}

}
