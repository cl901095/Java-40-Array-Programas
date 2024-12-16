package com.array40Programs;

import java.util.Arrays;

public class InsertElementInArray {

	public static int[] addElement(int[] arr, int element) {

		int temp[] = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		temp[arr.length] = element;

		return temp;
	}

	public static void main(String[] args) {

		int arr[] = { 30, 50, 20, 40, 10 };  //size=5

		int element = 99;

		System.out.println("Original array: " + Arrays.toString(arr));

		arr = addElement(arr, element);

		System.out.println("New array: " + Arrays.toString(arr));
	}

}
