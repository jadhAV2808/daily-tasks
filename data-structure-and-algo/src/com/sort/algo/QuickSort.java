package com.sort.algo;

public class QuickSort {
	
	public static void quickSort(int [] arr,int start,int end) {
		
		if(end-start<2)
			return;
		int pivotIndex=partition(arr,start,end);
		quickSort(arr,start,pivotIndex);
		quickSort(arr,pivotIndex+1,end);
	}

	private static int partition(int[] arr, int start, int end) {
		
		int pivot=arr[start];
		int i=start;
		int j=end;
		
		while(i<j) {
			
			while(i<j && arr[--j]>=pivot);
			if(i<j) {
				arr[i]=arr[j];
			}
			
			while(i<j && arr[++i]<=pivot);
			if(i<j) {
				arr[j]=arr[i];
			}
		}
		arr[j]=pivot;
		return j;
	}

	public static void main(String[] args) {
		
		int [] arr= {20,35,-15,7,55,1,-22};
		
		quickSort(arr,0,arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	
	}

}
