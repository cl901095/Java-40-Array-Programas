package com.arraysDemo;

public class RepeatedElements {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 2, 1, 3, 4, 5 };
		System.out.println("Repeated Elements are:");
		for (int i = 0; i <= arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
				
			}
			if(count==1) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
