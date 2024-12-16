package com.array40Programs;

public class MissingElements {

	public static void main(String[] args) {
		int [] input = {1,5,3,2};
		
		int copy[]=new int[6];
		for(int iter : input) {
		copy[iter]=1;
		}
		for(int i=1;i<copy.length;i++) {
		if(copy[i]==0) {
		System.out.println(i+" ");
		}
		}
		}

	}


