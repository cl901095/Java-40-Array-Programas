package com.array40Programs;

import java.io.*;
import java.util.Arrays;

public class EvenOrOddElements {

	public static void main(String[] args) throws Exception {
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

		displayOddEven(numbers);

	}

	public static void displayOddEven(int[] numbers) {

		int countEven = 0;
		int countOdd = 0;
		int even[] = null;
		int odd[] = null;

		for (int i : numbers) {
			if (i % 2 == 0)
				++countEven;
		}

		countOdd = numbers.length - countEven;

		even= new int[countEven];
		 odd = new int[countOdd];

		int i = 0;
		int j = 0;
		for (int num : numbers) {
			if (num % 2 == 0) { 
				even[i++] = num;
			} else {
				odd[j++] = num;
			}
			
		}

		
		  System.out.println("Even numbers: " + Arrays.toString(even));
		  System.out.println("Odd numbers: " + Arrays.toString(odd));
		 
		
	}

}
