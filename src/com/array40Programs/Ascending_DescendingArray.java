package com.array40Programs;

import java.util.Arrays;

public class Ascending_DescendingArray {

	public static void main(String[] args) {
		int[] arr = {34,56,23,71,94,13,6,48};
		System.out.println(Arrays.toString(arr));
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order:"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
		  for(int k=i+1;k<arr.length;k++) {
			if(arr[i]<arr[k]) {
				temp =arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
			}
	      }
		}
		System.out.println("Descending Order:"+Arrays.toString(arr));
   }
}
