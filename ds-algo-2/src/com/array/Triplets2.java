package com.array;

import java.util.Arrays;

public class Triplets2 {
	
	

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,15};
		int sum=18;
		findPossibleTriplets(arr,sum);

	}

	private static void findPossibleTriplets(int[] arr, int sum) {
		
		Arrays.sort(arr);
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			int l=i+1;
			int r=n-1;
			int x=arr[i];
			
			while(l<r) {
				if(x+arr[l]+arr[r]==sum) {
					System.out.println("{"+x+","+arr[l]+","+arr[r]+"}");
					l++;
					r--;
				}
				else if(x+arr[l]+arr[r]<sum)
					l++;
				else
					r--;
			}
		}
	}

}
