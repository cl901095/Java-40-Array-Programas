package com.array40Programs;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
	
		int[] arr = {13,15,12,18,19,17,23};
		for(int i=arr.length-1;i>=0;i--) {
		  System.out.print(arr[i]+" ");	
		}
		System.out.println("");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
