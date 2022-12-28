
/*
 * 400-600----> silver card
 * 600-800----> Gold card
 * 800-850----> Platinum card
 * else invalid
 * */


package com.numbers;

import java.util.Scanner;

public class CreditCardIssuer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Credit Score");
		
		int score=sc.nextInt();
		
		if(score<400 || score>850)
			System.out.println("invalid score");
		else if(score>=400 && score<600)
			System.out.println("Silver card");
		else if(score>=600 && score<800)
			System.out.println("Gold card");
		else if(score>=800 && score<850)
			System.out.println("Platinum card");

		
		sc.close();

		
	}

}
