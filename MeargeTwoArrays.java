package com.Qualifier.Array;

import java.util.Scanner;

public class MeargeTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size");
		int size=sc.nextInt();
		int first[]=new int[size];
		int second[]=new int[size];
		String srr[]=new String[size];
		System.out.println("Enter first array elements");
		for(int i=0;i<size;i++)
		{
			first[i]=sc.nextInt();
		}
		
		System.out.println("Enter Second array elements");
		for(int i=0;i<size;i++)
		{
			second[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			String ele=String.valueOf(first[i]+""+second[i]);
			 srr[i]=ele;
		}
		int finalArray[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			   int rev=Integer.parseInt(srr[i]);
				finalArray[i]=rev;
		}
		int max=finalArray[0];
		int min=finalArray[0];
		
		for(int i=0;i<size;i++)
		{
			if(finalArray[i]>max)
			{
				max=finalArray[i];
			}
		}
		for(int i=0;i<size;i++)
		{
			if(finalArray[i]<min)
			{
				min=finalArray[i];
			}
		}
		if(size%2==0)
		{
			System.out.println("Output is "+max);
		}
		else
		{
			System.out.println("output is"+min);
		}
		
		

	}

}
