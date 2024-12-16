package com.array40Programs;

import java.io.*;
import java.util.*;

public class RemoveOddNumbers {

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

		int newArr[] = removeOdd(numbers);

		System.out.println("Array after removing odd numbers: " + Arrays.toString(newArr));

	}

	public static int[] removeOdd(int[] numbers) {

		int countEven = 0;
		int even[] = null;

		for (int i : numbers) {
			if (i % 2 == 0)
				++countEven;
		}

		even = new int[countEven];

		int i = 0;
		for (int num : numbers) {
			if (num % 2 == 0) {
				even[i++] = num;
			}
		}

		return even;
	}

}
