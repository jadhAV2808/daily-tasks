package com.stack;

import java.util.EmptyStackException;

public class ArrayStack {
	
	
	private Employees[] stack;
	private int top;
	
	public ArrayStack(int capacity) {
		stack=new Employees[capacity];
	}
	
	public void push(Employees employee) {
		if(top==stack.length) {
			//need to resize the backing array
			Employees[]newArray=new Employees[2*stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack=newArray;
		}
		stack[top++]=employee;
	}
	
	public Employees pop() {
		if(isEmpty())
			throw new EmptyStackException();
		
		Employees employee=stack[--top];
		stack[top]=null;
		return employee;
	}
	
	public Employees peek() {
		if(isEmpty())
			throw new EmptyStackException();
		return stack[top-1];
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public void printSatck() {
		for(int i=top-1;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}

	
	
	
}
