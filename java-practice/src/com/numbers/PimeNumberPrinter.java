package com.numbers;

import java.util.Scanner;

public class PimeNumberPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start");
		int start=sc.nextInt();
		System.out.println("enter end");
		int end=sc.nextInt();
		
		for( int i=start;i<=end;i++) {
			int count=0;
			
			if(i>1) {
				for(int j=2;j<i/2;j++) {
					if(i%j==0) {
						count++;
						break;
					}
//						
				}
				
				if(count==0)
					System.out.print(i + " ");
			}
			
		}
		

	}

}
