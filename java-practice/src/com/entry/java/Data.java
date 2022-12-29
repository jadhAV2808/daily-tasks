package com.entry.java;

public class Data<T extends Number> {
	
	T t;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data q=new Data<Integer>();
		q.t=new Float(1);
		System.out.println(q.t);
		
	}

}
