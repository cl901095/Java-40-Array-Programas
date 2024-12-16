package com.array40Programs;
import java.io.*;
public class LinearSearch {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
         int[] arr = {15,14,13,12,11,10};
         int key=0;
         System.out.println("Enter search key:");
         String str1 = br.readLine();
         key =Integer.parseInt(str1);
         int size =arr.length;
         int index =linearSearch(arr,size,key);
         if(index==-1) {
        	 System.out.println(key+" "+"not Found.");
         }
         else {
        	 System.out.println(key+" "+"Found at Index "+index);
         }
         }
         public static int linearSearch(int[] arr,int size,int key) {
        	 for(int i=0;i<size;i++) {
        		 if(key==arr[i]) {
        			 return i;
        		 }
        	 }
        	 return -1;
         }
        
	

}
