package com.array40Programs;
import java.io.*;
public class RemoveElementInArray {

	public static void main(String[] args) throws IOException {
            int value=1 ,flag=0; 
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter no.of elements you want in array:");
		String str1 =br.readLine();
		int num =Integer.parseInt(str1);
		int a[] = new int[num];
		System.out.println("Enter all the Elements:");
		for(int i=0;i<num;i++) {
			String str2 =br.readLine();
			a[i]=Integer.parseInt(str2);
		}
		System.out.println("Enter the Element you want to delete:");
		String str3 =br.readLine();
		int  element = Integer.parseInt(str3);
		for(int i=0;i<num;i++) {
			if(a[i]==element) {
				 value=1;
				flag=i;
				break;
			}
			else {
			  value=0;
			}
		}
		if(  value==1) {
			for(int i=flag+1;i<num;i++) {
				a[i-1]=a[i];
			}
			System.out.println("After Removing Element:");
	         for(int i=0;i<num-2;i++) {
	        	 System.out.println(a[i]+",");
	         }
	         System.out.println(a[num-2]);
		}
		else {
			System.out.println("Element not found");
		}
		
		
	}
}
