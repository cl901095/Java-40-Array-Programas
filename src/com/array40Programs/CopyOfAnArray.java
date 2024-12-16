package com.array40Programs;

import java.util.Arrays;

public class CopyOfAnArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		int[] newArr =arr;
		System.out.println("Before Re-assingnment Elements");
		System.out.println("Original Array="+Arrays.toString(arr));
        System.out.println("Copied Array="+Arrays.toString(newArr));
	     arr[0]=56;
	     arr[1]=65;
	     System.out.println("After Re-assignment Elements");
		 System.out.println("Original Array="+Arrays.toString(arr));
	     System.out.println("Copied Array="+Arrays.toString(newArr));
		    
	}

}
