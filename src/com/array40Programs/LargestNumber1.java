package com.array40Programs;

public class LargestNumber1 {
 public static void main(String[] args) {
	int[] arr= {8,5,15,18,17,28,30};
	int largestValue =arr[0];
	for(int arr1:arr) {
		if(arr1>largestValue) {
			largestValue=arr1;
		}
	}
	
	System.out.println("LargestValue is:"+largestValue);
	}
	
 }

