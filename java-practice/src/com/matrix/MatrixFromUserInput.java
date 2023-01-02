package com.matrix;

import java.util.Scanner;

public class MatrixFromUserInput {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int m=sc.nextInt();
		
		System.out.println("Enter number of colomns");
		int n=sc.nextInt();
		
		int a[][]=new int[m][n];
		
		System.out.println("enter matrix elements");
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println(" ");
		}

	}

}
