package com.arraysDemo;

import java.util.Arrays;

public class AddElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 5 };
		int[] temparr = new int[arr.length + 1];

		int add = 6;
		for (int i = 0; i < arr.length; i++) {
			temparr[i] = arr[i];
		}
		temparr[arr.length] = add;
		for (int i = 0; i < temparr.length; i++) {
			System.out.println(temparr[i]);
		}
	}

}
