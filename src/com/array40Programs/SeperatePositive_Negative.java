package com.array40Programs;

import java.io.*;
import java.util.Arrays;

public class SeperatePositive_Negative {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter size of the array: ");
		String str1 = br.readLine();
		int n = Integer.parseInt(str1);
		int numbers[] = new int[n];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; ++i) {
			String str2 = br.readLine();
			numbers[i] = Integer.parseInt(str1);
		}
		seperate(numbers);
	}
	public static void seperate(int[] numbers) {
		int posCount = 0;
		int negCount = 0;
		int positive[] = null;
		int negative[] = null;

		for (int i : numbers) {
			if (i >= 0)
				++posCount;
			else
				++negCount;
		}

		if (posCount == 0) {
			System.out.println("Array contains only negative numbers");

			System.out.println("Array = " + Arrays.toString(numbers));
			return;
		} else if (negCount == 0) {
			System.out.println("Array contains only positive numbers");

			System.out.println("Array = " + Arrays.toString(numbers));
			return;
		}

		positive = new int[posCount];
		negative = new int[negCount];

		int i = 0;
		int j = 0;
		for (int num : numbers) {
			if (num >= 0) {
				positive[i++] = num;
			} else {
				negative[j++] = num;
			}
		}

		System.out.println("Negative numbers = " + Arrays.toString(negative));
		System.out.println("Positive numbers = " + Arrays.toString(positive));
	}

}
