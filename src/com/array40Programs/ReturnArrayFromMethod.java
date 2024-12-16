package com.array40Programs;

public class ReturnArrayFromMethod {

	public static void main(String[] args) {
		int[] a=readArray();
		
         for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]+" "); 
         }
	}
public static int[] readArray() {
	int[] arr= {10,20,30,40};
    return arr;
}
}
