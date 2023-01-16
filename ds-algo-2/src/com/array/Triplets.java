package com.array;

public class Triplets {
	
	public static void findPossibleTriplets(int arr[],int sum) {
		
		int n=arr.length;
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<n-1;j++) {
				for(int k=0;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==sum)
						System.out.println("{"+ arr[i]+","+arr[j]+","+arr[k]+ "}");
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,15};
		int sum=18;
		findPossibleTriplets(arr,sum);

	}

}
