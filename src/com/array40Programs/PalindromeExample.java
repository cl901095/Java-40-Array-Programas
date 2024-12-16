package com.array40Programs;
import java.io.*;
import java.util.Arrays;
public class PalindromeExample {

	public static void main(String[] args) throws IOException {
		
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter a String:");
        String str = br.readLine();
		char[] myArray =str.toCharArray();
		int size = myArray.length;
	      char [] original = Arrays.copyOf(myArray,size);

	      for (int i = 0; i < size/2 ; i++) {    // [0]n  [1]a  [2]v [3]y [4]a  size is =5  i<2
	         char temp = myArray[i];
	         myArray[i] = myArray[size-i-1];         
	         myArray[size-i-1] = temp;
	         System.out.println("Reverse Array"+Arrays.toString(myArray));
	      }
	      System.out.println("Original Array"+Arrays.toString(original));
	      System.out.println("Reverse Array"+Arrays.toString(myArray));

	      if(Arrays.equals(myArray, original)) {
	         System.out.println("Entered string is a palindrome");
	      } else {
	         System.out.println("Entered string is not a palindrome");
	      }
	    }

   }

