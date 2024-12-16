package com.array40Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DisplayNegativeNumbers {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter size of the array: ");
		String str1 = br.readLine();
		int n = Integer.parseInt(str1);
		int numbers[] = new int[n];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			String str2 = br.readLine();
			numbers[i] = Integer.parseInt(str2);
		}

		displayNegative(numbers);

	}

	public static void displayNegative(int[] numbers) {

		boolean flag = false;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println("Array doesn’t contain negative number.");
			return;
		}

		System.out.println("Negative numbers = ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				System.out.print(numbers[i] + " ");
			}
		}

	}

}
