package com.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Challenge2 {

	public static void main(String[] args) {
		
		Emp e1=new Emp(121,"jane","jones");
		Emp e2=new Emp(131,"john","scena");
		Emp e3=new Emp(141,"mayami","alvar");
		Emp e4=new Emp(151,"ram","charan");
		Emp e5=new Emp(161,"mary","smith");
		Emp e6=new Emp(171,"mike","wilson");
		Emp e7=new Emp(131,"john","scena");
		Emp e8=new Emp(151,"ram","charan");
		Emp e9=new Emp(131,"john","scena");
		
		LinkedList<Emp> employees=new LinkedList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		
		employees.forEach(e->System.out.println(e));
		

		System.out.println(" ");
		
		HashMap<Integer ,Emp>empTable=new HashMap<>();
		ListIterator<Emp>iterator=employees.listIterator();
		List<Emp>remove=new ArrayList<>();
		
		while(iterator.hasNext()) {
			Emp employee=iterator.next();
			if(empTable.containsKey(employee.getId())) {
				remove.add(employee);
			}
			else {
				empTable.put(employee.getId(), employee);
			}
		}
		
		
		
		for(Emp e:remove) {
			employees.remove(e);
		}
		
		System.out.println("------------------------------------");
		
		employees.forEach(e->System.out.println(e));
	}

}
