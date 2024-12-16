package com.array40Programs;
import java.io.*;
import java.util.Arrays;
public class UserInput {

	public static void main(String[] args) throws IOException {
		
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter the Size of an Array:");
      String str = br.readLine();
      int size =Integer.parseInt(str);
      int[] arr= new int[size];
      System.out.println("The size of Array is:"+arr.length);
      System.out.println("Enter the Elemets ");
      for(int i=0;i<size;i++) {
    	  String str1=br.readLine();
    	  arr[i]=Integer.parseInt(str1);
      }
      System.out.println(Arrays.toString(arr));
     
     }
      
	}


