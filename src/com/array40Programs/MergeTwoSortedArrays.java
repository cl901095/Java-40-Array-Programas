package com.array40Programs;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		    String[] str1 = {"Navya","Jyothsna","Srilatha","Karthika"};
		    String[] str2 = {"Shiva","Rahul","Sunny","Praveen"};
	        Arrays.sort(str1);
	        Arrays.sort(str2);
		     
		    String[] newArray = new String[str1.length+str2.length];
	        System.out.println("Size"+newArray.length);
	        
	        
	        System.arraycopy(str1, 0, newArray,0, str1.length);        
	        System.arraycopy(str2, 0,newArray,str1.length,str2.length);
		    System.out.println("Array1="+Arrays.toString(str1));
		    System.out.println("Array2="+Arrays.toString(str2));
		    System.out.println("Merged Array="+Arrays.toString(newArray));
		    
		}


	}


