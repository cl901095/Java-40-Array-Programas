package com.array40Programs;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) { //== is meant for reference comparison and .equals method meant for conten
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = arr1;
		int[] arr3 = { 10, 30, 15, 63, 60 };
		int[] arr4 = { 10, 20, 30, 40 };
		System.out.println("Compare Two Arrays:");
		/*
		 * if(arr1==arr2) { System.out.println("Both arr1 & arr2 are same"); } else {
		 * System.out.println("Both array1 & arr2 are not same"); } if(arr2==arr3) {
		 * System.out.println("Both arr1 & arr2 are same"); } else {
		 * System.out.println("Both array2 & arr3 are not same"); } if(arr3==arr4) {
		 * System.out.println("Both arr3 & arr4 are same"); } else {
		 * 
		 * System.out.println("Both array3 & arr4 are not same"); } if(arr1==arr4) {
		 * 
		 * System.out.println("Both 1 & arr4 are  same"); } else {
		 * System.out.println("Both array1 & arr4 are not same"); }
		 */
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Both arr1 & arr2 are same");
		} else {
			System.out.println("Both array1 & arr2 are not same");
		}
		if (Arrays.equals(arr2, arr3)) {
			System.out.println("Both arr1 & arr2 are same");
		} else {
			System.out.println("Both array2 & arr3 are not same");
		}
		if (Arrays.equals(arr3, arr4)) {
			System.out.println("Both arr3 & arr4 are same");
		} else {

			System.out.println("Both array3 & arr4 are not same");
		}
		if (Arrays.equals(arr1, arr2)) {

			System.out.println("Both 1 & arr4 are  same");
		} else {
			System.out.println("Both array1 & arr4 are not same");
		}

	}
}
