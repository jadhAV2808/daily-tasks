package com.sort.algo;

public class ShellSort {

	public static void main(String[] args) {
		
		int arr[]= {12,-20,45,-35, 5,32,-9};
		
		
		for(int gap=arr.length/2;gap>0;gap/=2) {
			
			for(int i=gap;i<arr.length;i++) {
				int newElement=arr[i];
				
				int j=i;
				
				while(j>=gap && arr[j-gap]>newElement) {
					arr[j]=arr[j-gap];
					j-=gap;
				}
				
				arr[j]=newElement;
			}
	
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");




	}

}
