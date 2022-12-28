/* 
 *  2 digit number=sum of digits+ product of the digit
 * */

package com.numbers;

import java.util.Scanner;

public class SpecialNumberChecker {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two digit numberr");
		
		int num=sc.nextInt();
		
		int digit1,digit2,result,copy=num;
		
		digit1=num%10;
		digit2=num/10;
		
		result=(digit1+digit2) + (digit1*digit2);
		
		if(result==copy)
			System.out.println("Special Number");
		else
			System.out.println("NOT a Special Number");
	}

}
