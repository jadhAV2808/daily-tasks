package com.numbers;

import java.util.Scanner;

public class ArmstrongNumberChecker {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter num");
		
		int num=sc.nextInt();
		
		int copy=num , sum=0, digit=0;
		
		while(num!=0) {
			digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
		}
		
		System.out.println(copy==sum ? "Armstrong number":"Not Armstrong number");

	}

}
