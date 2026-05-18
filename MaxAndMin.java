package com.day2;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array : ");
		int s=sc.nextInt();
		System.out.println("Enter elements : ");
		int arr[]=new int[s];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("min element is "+min);
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				max=arr[i];
			}
		}
		
		System.out.println("min element is "+max);
		
//		7 5 8 4 2
//		  7<7
//		  5<7   min=5
//		  8<5
//		  4<5   min=4
//		  2<4   min 2
		
				

	}

}
