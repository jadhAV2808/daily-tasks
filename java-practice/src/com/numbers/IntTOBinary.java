package com.numbers;

import java.util.Scanner;

public class IntTOBinary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number");
		
		int num=sc.nextInt();
		
		int remainder[]=new int[10];
		int i=0;
		
		while(num!=0) {
			remainder[i]=num%2;
			num=num/2;
			i++;
		}
		
		for(int j=i-1; j>=0;j--)
			System.out.print(remainder[j]);
		sc.close();
	}

}
