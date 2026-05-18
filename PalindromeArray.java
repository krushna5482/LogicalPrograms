package com.Qualifier.Array;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int rev[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int j=0;
		for(int i=size-1;i>=0;i--)
		{
			rev[j++]=arr[i];
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(rev[i]);
		}
		if(Arrays.equals(arr, rev))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
