package com.arraysDemo;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] arr = { 15, 8, 9, 2, 11, 4, 7 };
		int temp = 0;
        for(int i=0;i<arr.length/2;i++) {
        	temp=arr[i]; 
        	arr[i]=arr[arr.length-1-i]; 
        	arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        for(int arr1:arr) {
        	System.out.print(arr1+" ");
        }
	}

}
