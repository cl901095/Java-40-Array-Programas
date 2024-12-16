package com.array40Programs;

import java.util.Arrays;

public class ReverseAnArray_WhileLoop {

	public static void main(String[] args) {
		int[] arr= {20,15,17,19,21,35,76,31};
		int i=0;
		int j= arr.length-1;
		int temp;
		while(i<j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));

	}

}
