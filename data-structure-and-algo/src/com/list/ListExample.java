package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<Employee>empList=new ArrayList<>();
		
		empList.add(new Employee(121,"jane","jones"));
		empList.add(new Employee(131,"john","scena"));
		empList.add(new Employee(141,"mayami","alvar"));
		empList.add(new Employee(151,"ram","charan"));
		empList.add(new Employee(161,"mary","smith"));
		empList.add(new Employee(171,"mike","wilson"));
		
		empList.forEach(employee->System.out.println(employee.getFname() + " "+employee.getLname()));
		
		System.out.println(empList);
		
		empList.set(2, new Employee(190,"mayur","chavan"));
		
		empList.forEach(emp->System.out.println(emp.getId()+" "+emp.getFname()+" "+emp.getLname()));
		
		System.out.println("size of list is "+empList.size());
		
		System.out.println(empList.contains(new Employee(131,"john","scena")));
		
	}

}
