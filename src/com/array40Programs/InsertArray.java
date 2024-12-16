package com.array40Programs;
import java.io.*;

public class InsertArray 
{
    public static void main(String[] args) throws Exception 
    {
        int n, pos, x;
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       
        System.out.print("Enter no. of elements you want in array:");
        String str1 =br.readLine();
        n = Integer.parseInt(str1);  
        int a[] = new int[n+1]; 
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {     String str2 =br.readLine();  
            a[i] = Integer.parseInt(str2);
        }
        
        System.out.print("Enter the position where you want to insert element:");
        String str3 =br.readLine();
        pos = Integer.parseInt(str3);  
        System.out.print("Enter the element you want to insert:");
        String str4 =br.readLine();
        x =Integer.parseInt(str4);  
        for(int i = (n-1); i >= (pos-1); i--) 
        {
            a[i+1] = a[i];        
        }
        a[pos-1] = x;
        System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
    }
}

