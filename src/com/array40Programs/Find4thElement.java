package com.array40Programs;
import java.io.*;
public class Find4thElement {

	public static void main(String[] args) throws IOException {
		int[] arr = {2,5,7,9,10,15,19};
		/*for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[3]) {
				System.out.println("The fourth element in given array is:"+arr[i]);
			}
		}*/
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter nth postion");
		String str =br.readLine();
		int n = Integer.parseInt(str);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[n-1]) {
				System.out.println(arr[i]);
			}
		}
		

	}

}
