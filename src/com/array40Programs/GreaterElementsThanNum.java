package com.array40Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterElementsThanNum {

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

		System.out.print("Enter number = ");
		String str3 = br.readLine();
		int num = Integer.parseInt(str3);

		System.out.println("Numbers greater then given number = ");
		
		display(numbers, num);

	}

	public static void display(int[] numbers, int num) {

		for (int i : numbers) {
			if (i > num)
				System.out.print(i + " ");
			
		}
	}
}
