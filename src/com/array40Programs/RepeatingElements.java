package com.array40Programs;

public class RepeatingElements {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 1, 5, 7, 5, 4, 3, 9 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}

	}

}
