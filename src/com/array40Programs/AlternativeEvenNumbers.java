package com.array40Programs;

import java.util.Arrays;

public class AlternativeEvenNumbers {

	public static void main(String[] args) {
		int count = 0;
		int[] temp = new int[count];
		int[] arr = { 10, 9, 20, 66, 12, 16, 13, 45, 98, 39, 36 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++; // 1 2
				if (count % 2 != 0) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
