package com.hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {
	
	private LinkedList<StoredEmp>[] hashtable;
	
	public ChainedHashtable() {
		hashtable=new LinkedList[10];
		for(int i=0;i<hashtable.length;i++) {
			hashtable[i]=new LinkedList<StoredEmp>();
		}
	}
	
	private int hashKey(String key) {
		return key.length()%hashtable.length;
	}
	
	public void put(String key,Emp emp) {
		int hashedKey=hashKey(key);
		hashtable[hashedKey].add(new StoredEmp(key,emp));
	}
	
	public Emp get(String key) {
		int hashedKey=hashKey(key);
		ListIterator<StoredEmp>iterator=hashtable[hashedKey].listIterator();
		StoredEmp emp=null;
		while(iterator.hasNext()) {
			emp=iterator.next();
			if(emp.key.equals(key)) {
				return emp.emp;
			}
		}
		return null;
	}
	
	public Emp remove(String key) {
		
		int hashedKey=hashKey(key);
		ListIterator<StoredEmp>iterator=hashtable[hashedKey].listIterator();
		StoredEmp emp=null;
		int index=0;
		while(iterator.hasNext()) {
			emp=iterator.next();
			index++;
			if(emp.key.equals(key)) {
				break;
			}
		}
		if(emp==null)
			return null;
		else {
			hashtable[hashedKey].remove(index);
			return emp.emp;
		}
			
	}
	
	public void printHashtable() {
		for(int i=0;i<hashtable.length;i++) {
			if(hashtable[i].isEmpty())
				System.out.println("position "+ i + ": empty");
			else {
				System.out.print("position "+ i + ": ");
				ListIterator<StoredEmp>iterator=hashtable[i].listIterator();
				while(iterator.hasNext()) {
					System.out.print( iterator.next().emp);
					System.out.print("->");
				}
				System.out.println("null");
			}
				
		}
	}
	

}
