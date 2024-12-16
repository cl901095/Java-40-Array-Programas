package com.array40Programs;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
       int[] arr = {30,50,60,15,56,89,25,60,30};
       
       int newArray[] = removeDuplicates(arr);
       System.out.println("Original array:"+Arrays.toString(arr));
       System.out.println("After removing Duplicates:"+Arrays.toString(newArray));

	}

	public static int[] removeDuplicates(int[] arr) {
		
		int j = 0;
	    int lastIndex =arr.length-1;
		for(int i=0;i<lastIndex;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];  
				
			}
		}
		if(arr[j]!=arr[lastIndex]) {  
			arr[j++]=arr[lastIndex];  
			
		}
		return Arrays.copyOf(arr,j);
		
	}

}
