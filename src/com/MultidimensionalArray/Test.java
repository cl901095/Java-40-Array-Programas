package com.MultidimensionalArray;

public class Test {

	public static void main(String[] args) {
		int arr[][] = { { 100, 200 }, { 300, 400 } };

		for (int[] ar : arr) {
			for(int x : ar) {
				System.out.println(x);
			}
		}
	}

}
