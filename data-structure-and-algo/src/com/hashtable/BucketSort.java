package com.hashtable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {

	public static void main(String[] args) {
		
		int[] arr= {45,56,23,67,32,68,33,95,91,59};

		bucketSort(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private static void bucketSort(int[] arr) {
		
		List<Integer>[] buckets=new List[10];
		
		for(int i=0;i<buckets.length;i++)
			//using LinkeList
			//buckets[i]=new LinkedList<Integer>();
//			using Arraylist
			buckets[i]=new ArrayList<Integer>();
		
		
		
		for(int i=0;i<arr.length;i++) {
			buckets[hash(arr[i])].add(arr[i]);
		}
		
		for(List bucket:buckets) {
			Collections.sort(bucket);
		}
		
		int j=0;
		for(int i=0;i<buckets.length;i++) {
			for(int value:buckets[i]) {
				arr[j++]=value;
			}
		}
	}
	
	private static int hash(int value) {
		return value/10;
	}

}
