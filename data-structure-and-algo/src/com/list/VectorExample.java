/*
 * vector class is an threadSafe arrayList
 * Synchronized
 * 
 */

package com.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
	
	
		List<Employee>empList=new Vector<>();
		
		empList.add(new Employee(121,"jane","jones"));
		empList.add(new Employee(131,"john","scena"));
		empList.add(new Employee(141,"mayami","alvar"));
		empList.add(new Employee(151,"ram","charan"));
		empList.add(new Employee(161,"mary","smith"));
		empList.add(new Employee(171,"mike","wilson"));
		

		
	}

}
