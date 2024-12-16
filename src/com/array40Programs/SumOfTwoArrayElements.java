package com.array40Programs;

import java.util.Arrays;

public class SumOfTwoArrayElements {

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 6, 15, 8, 9, 10 };
		int[] arr2 = { 5, 9, 16, 21, 17, 2 ,3};
		int[] arr3 =new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i]+arr2[i];
		}
		System.out.println(Arrays.toString(arr3));
	

	}

} 
