package com.array40Programs;

import java.util.Arrays;

public class DisplayArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("using for loop");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("using foreach loop");
		for (int arr1 : arr) {
			System.out.print(arr1+" ");
		}
		System.out.println("");
		System.out.println("using Arrays.toString");
		System.out.println(Arrays.toString(arr));
	}

}
