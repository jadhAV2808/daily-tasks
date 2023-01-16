package com.array;

public class PairSum {

	public static void main(String[] args) {
		
		int[] arr= {10,5,2,3,-6,9,11};
		int[]result=new int[2];
		int sum=4;
		
		for(int i=0;i<arr.length;i++) {
			int x=sum-arr[i];
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==x) {
					result[0]=x;
					result[1]=arr[i];
				}
					
			}
		}
		
		System.out.println(result[0]+ " "+result[1]);
 
	}
	
		
}
