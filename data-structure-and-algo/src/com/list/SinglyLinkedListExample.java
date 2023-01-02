package com.list;

public class SinglyLinkedListExample {
	
	public static void main(String[] args) {
		
		
		Employee e1=new Employee(121,"jane","jones");
		Employee e2=new Employee(131,"john","scena");
		Employee e3=new Employee(141,"mayami","alvar");
		Employee e4=new Employee(151,"ram","charan");
		Employee e5=new Employee(161,"mary","smith");
		Employee e6=new Employee(171,"mike","wilson");
		
		EmployeeLinkedList list=new EmployeeLinkedList();
		
		list.addToFront(e6);
		list.addToFront(e5);
		list.addToFront(e4);
		list.addToFront(e3);
		list.addToFront(e2);
		list.addToFront(e1);
		
		
		list.printList();
		
		int len=list.getSize();
		System.out.println(len);
	
		
	}
	
	
	

}
