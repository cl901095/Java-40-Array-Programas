package com.array40Programs;

import java.util.Arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		int[] arr= {8,15,21,18,25,6,31};
		Arrays.sort(arr);
		System.out.println("The SmallestValue is:"+arr[0]);
        System.out.println("************************************");
      int smallestNumber =arr[0];
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]<smallestNumber) {
        		smallestNumber=arr[i];
        	}
        }
        System.out.println("SmallestNumber is:"+smallestNumber);
	}

}
