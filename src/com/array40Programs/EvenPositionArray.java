package com.array40Programs;

public class EvenPositionArray {

	public static void main(String[] args) {
		//int[] arr = {0,1,2,3,4,5,6,7,8,9};
		int [] arr = {10,15,12,13,17,41};
		for(int i=0;i<=arr.length-1;i++) {
			if(i%2==0) {
			
				System.out.println(i);
				continue;
			}
		}

	}

}
