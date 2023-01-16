package com.vector;

import java.util.Vector;

public class FizzBuzz {
	
	
	public static  void fizzbuzz(int num) {
		
		Vector v=new Vector<>();
		
		for(int i=1;i<=num;i++) {
			if(i%3==0 && i%5==0)
				v.add("FizzBuzz");
			else if(i%3==0)
				v.add("Fizz");
			else if(i%5==0)
				v.add("Buzz");
			else
				v.add(i);
		}
		
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
	}
	
	
	

	public static void main(String[] args) {
		
		fizzbuzz(15);
		
		

	}

}
