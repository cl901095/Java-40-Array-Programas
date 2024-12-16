package com.array40Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfEven_OddElements {

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

			numbers[i] = Integer.parseInt(str2);

			oddEvenSum(numbers);

		}
	}

	public static void oddEvenSum(int[] numbers) {

		int oddSum = 0;
		int evenSum = 0;

		for (int num : numbers) {
			if (num % 2 == 0) {
				evenSum = evenSum + num;
			} else {
				oddSum = oddSum + num;
			}
		}

		System.out.println("Odd numbers sum = " + oddSum);
		System.out.println("Even numbers sum = " + evenSum);
	}

}
