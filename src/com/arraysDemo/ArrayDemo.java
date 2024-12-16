package com.arraysDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		//int[] arr1 = new int[-3];//NegativeArraySizeException
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]);//ArrayIndexoutofboundsException
		
		 arr[0]=50;
		 arr[1]=65;
		 arr[2]=95;
		//arr[3]=100;
		//arr[0] ="Navya";
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 
		 int [] arr3 = {1,2,3,4,5};
		 System.out.println(arr3.length);

	}

}
