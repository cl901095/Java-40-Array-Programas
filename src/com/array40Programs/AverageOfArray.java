package com.array40Programs;

public class AverageOfArray {

	public static void main(String[] args) {
		int[] arr = { 55, 65, 75, 95 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int average = sum / arr.length;

		System.out.println("Average Of an Array:" + average);
	}

}
