package com.matrix;

import java.util.Scanner;

public class SumOfMatrices {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		/*for first matrix*/
		System.out.println("Enter number of rows for first matrix");
		int m=sc.nextInt();
		
		System.out.println("Enter number of colomns for first matrix");
		int n=sc.nextInt();
		
		int a[][]=new int[m][n] ;
		
		System.out.println("enter matrix elements");
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		/* for second matrix*/
		System.out.println("Enter number of rows for second matrix");
		int m1=sc.nextInt();
		
		System.out.println("Enter number of colomns for second matrix");
		int n1=sc.nextInt();
		
		int b[][]=new int[m1][n1] ;
		
		System.out.println("enter matrix elements");
		
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		
		/*printing first matrix*/
		System.out.println("Matrix 1 is :");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println(" ");
		}
		
		/*printing second matrix*/
		System.out.println("Matrix 2 is :");
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				System.out.print(b[i][j]+ " ");
			}
			System.out.println(" ");
		}

		/*matrix sum*/
		int sum[][]=new int[m][n];
		
		if(m==m1  && n==n1) {
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					sum[i][j]=a[i][j]+b[i][j];
				}
			}
			
			/*printing sum matrix*/
			System.out.println(" Sum Matrix is :");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(sum[i][j]+ " ");
				}
				System.out.println(" ");
			}

		}
		else
			System.out.println("these matrices are not of same size !");
		
		
		

		sc.close();
	}

}
