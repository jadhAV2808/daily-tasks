package com.numbers;

import java.util.Scanner;

public class AllSpecialTwoDigitNum {

	public static void main(String[] args) {
		
		

		for(int num=10;num<100;num++) {
			int  copy=num , result=0,digit1 , digit2;
			

			digit1=num%10;
			digit2=num/10;
			
			result= (digit1+digit2) + (digit1*digit2);
			
			if(result==copy)
				System.out.print(copy + " ");
			
		}

	}

}
