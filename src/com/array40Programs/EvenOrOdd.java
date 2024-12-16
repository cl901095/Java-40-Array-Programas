package com.array40Programs;

public class EvenOrOdd {

	public static void main(String[] args) {
		 int[] a = {2,5,6,9,10};
         System.out.println("Even Numbers:");
         for(int i=0;i<a.length;i++) {
      	   if(a[i]%2==0) {
      		   System.out.print(a[i]+" ");
      	   }
         }  
        System.out.println(""); 
         System.out.println("Odd Numbers:");
         for(int i=0;i<a.length;i++) {
      	   if(a[i]%2!=0) {
      		   System.out.print(a[i]+" ");
      	   }
         }    

	}

}
