package com.array40Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfPositiveNumbers {

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

		int sum = positiveSum(numbers);

		System.out.println("Sum of positive numbers = " + sum);

	}

	public static int positiveSum(int[] numbers) {

		int sum = 0;

		for (int i : numbers) {
			if (i >= 0)
				sum += i;
		}

		return sum;

	}

}
