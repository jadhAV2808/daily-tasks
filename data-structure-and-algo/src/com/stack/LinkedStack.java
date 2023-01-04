package com.stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

	private LinkedList<Employees>stack;
	
	public LinkedStack() {
		stack=new LinkedList<Employees>();
	}
	
	public void push(Employees emp) {
		stack.push(emp);
	}
	
	public Employees pop() {
		return stack.pop();
	}
	
	public Employees peek() {
		return stack.peek();
	} 
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		ListIterator<Employees> iterator=stack.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
