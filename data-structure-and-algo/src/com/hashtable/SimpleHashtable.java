package com.hashtable;

public class SimpleHashtable {
	
	private Emp[] hashtable;
	
	public SimpleHashtable() {
		hashtable=new Emp[10];
	}
	
	private int hashKey(String key) {
		return key.length()%hashtable.length;
	}
	
	public void put(String key,Emp emp) {
		int hashedKey=hashKey(key);
		if(hashtable[hashedKey]!=null)
			System.out.println("Sorry, There is already an employee at position "+ hashedKey);
		else
			hashtable[hashedKey]=emp;
	}
	
	public Emp get(String key) {
		int hashedKey=hashKey(key);
		return hashtable[hashedKey];
	}
	
	public void printHashtable() {
		for(int i=0;i<hashtable.length;i++) {
			if(hashtable[i]!=null)
				System.out.println(hashtable[i]);
		}					
	}
	
	
}
