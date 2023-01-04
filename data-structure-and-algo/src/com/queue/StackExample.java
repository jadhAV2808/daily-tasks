package com.queue;

public class StackExample {

	public static void main(String[] args) {
		
		Students s1=new Students(1,"asad","khan");
		Students s2=new Students(2,"pooja","sharma");
		Students s3=new Students(3,"radha","rani");
		Students s4=new Students(4,"asad","saiyad");
		Students s5=new Students(5,"chia","khan");
		
		ArrayQueue queue=new ArrayQueue(10);
		
		queue.add(s5);
		queue.add(s4);
		queue.add(s3);
		queue.add(s2);
		queue.add(s1);
		
		queue.printQueue();
		
		System.out.println(" ");
		
		queue.remove();
		queue.remove();
		queue.printQueue();
		
		System.out.println(" ");
		
		
		
	}

}
