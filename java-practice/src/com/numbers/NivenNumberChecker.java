package com.numbers;

import java.util.Scanner;

public class NivenNumberChecker {

	public static void main(String[] args) {
		
		    Scanner sc=new Scanner(System.in);
			
			System.out.println("enterr numberr");
			
			int num=sc.nextInt();
			
			int digit=0, sum=0, copy=num;
			
			while(num!=0) {
				digit=num%10;
				sum=digit+sum;
				num=num/10;
			}
			
			if(copy%sum==0)
				System.out.println("Niven Number");
			else
				System.out.println("NOT a Niven Number");
		

		   sc.close();
		   
	}

}
