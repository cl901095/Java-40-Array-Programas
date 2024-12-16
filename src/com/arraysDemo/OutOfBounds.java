package com.arraysDemo;

public class OutOfBounds {

	public static void main(String... args) {

		int arr [ ]  = { 101, 102, 103, 104 } ;	

		arr [ 0 ] = 200 ;	

		arr [ 1 ] = 300 ; 
		System.out.println(arr[2]);

		System.out.println ( arr [ 101 ] ) ;  
}

}
