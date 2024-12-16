package com.array40Programs;
import java.util.*;
public class LargestNumber {

	public static void main(String[] args) {

		int[] arr = { 5, 2, 6, 9, 15, 18, 10 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length - 1]);

	}

}
