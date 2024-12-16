//Write a java program to find min and max elements in the array  using sort method
package com.arraysDemo;

import java.util.Arrays;

public class Min_MaxElement {

	public static void main(String[] args) {
		int arr[] = {15,8,9,2,11,4};
		Arrays.sort(arr);
		System.out.println("Min Element:"+arr[0]);
		System.out.println("Max Element:"+arr[arr.length-1]);
		

	}

}
