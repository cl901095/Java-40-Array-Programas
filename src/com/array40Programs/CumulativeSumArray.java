package com.array40Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CumulativeSumArray {

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
			numbers[i] = Integer.parseInt(str2);
		}
		int sum[] = cumulativeSum(numbers);
		System.out.println("Cumulative sum = " + Arrays.toString(sum));
	}
	public static int[] cumulativeSum(int[] numbers) {
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum =sum+numbers[i];
			numbers[i] = sum;
		}

		return numbers;

	}

}
