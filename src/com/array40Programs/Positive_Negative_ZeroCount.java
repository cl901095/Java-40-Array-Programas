package com.array40Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Positive_Negative_ZeroCount {

	public static void main(String[] args) throws IOException {
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

		checkNumbers(numbers);

	}

	public static void checkNumbers(int[] numbers) {

		int positive = 0;
		int negative = 0;
		int zero = 0;

		for (int num : numbers) {
			if (num > 0) {
				++positive;
			} else if (num < 0) {
				++negative;
			} else {
				++zero;
			}
		}

		System.out.println("Positive numbers = " + positive);
		System.out.println("Negative numbers = " + negative);
		System.out.println("Zeros = " + zero);

	}

}
