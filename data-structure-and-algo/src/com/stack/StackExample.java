package com.stack;

import com.list.Employee;

public class StackExample {

	public static void main(String[] args) {
		
		ArrayStack arrstack=new ArrayStack(10);
		
		
		arrstack.push(new Employees(101,"sudha","murthy"));
		arrstack.push(new Employees(121,"radha","rani"));
		arrstack.push(new Employees(131,"nand","gopal"));
		arrstack.push(new Employees(141,"ahilya","mata"));
		arrstack.push(new Employees(151,"samata","patil"));
		arrstack.push(new Employees(161,"smruti","jalke"));
		
		//stack.printSatck();
		
		System.out.println(arrstack.peek());
		
		System.out.println("popped-> "+arrstack.pop());
		
		System.out.println(arrstack.peek());
		
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Linked-List  backing stack");
		
		LinkedStack lstack=new LinkedStack();
		
		lstack.push(new Employees(1,"abc","def"));
		lstack.push(new Employees(2,"ghi","kjl"));
		lstack.push(new Employees(3,"mno","pqr"));
		lstack.push(new Employees(4,"stu","vwx"));
		lstack.push(new Employees(5,"yza","bcd"));
		lstack.push(new Employees(6,"efg","hij"));
		
		
		lstack.printStack();
		
		System.out.println("");
		
		System.out.println("Peak item is "+lstack.peek());
		
		System.out.println("");
		
		System.out.println("popped item is "+lstack.pop());
		
	}

}
