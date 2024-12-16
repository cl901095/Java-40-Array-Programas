package com.array40Programs;

import java.util.Arrays;

public class RepeatedElementsCount {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 10, 15, 18, 30, 21 };
		System.out.println("The Original Array With Duplicates:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
		}
		System.out.println("The count of Duplicates are:" + count);
	}

}
