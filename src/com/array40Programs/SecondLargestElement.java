package com.array40Programs;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
	   int[] arr= {5,7,3,14,63,17};
	   Arrays.sort(arr);
	   System.out.println(Arrays.toString(arr));
	   System.out.println("Second HighestValue is:"+arr[arr.length-2]);
	}
}