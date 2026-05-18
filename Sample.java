package com.Qualifier.Array;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		System.out.println("Enter the elements");
		int z=0;
		for(int i=0;i<size;i++)
		{    int ele=sc.nextInt();
		   if(ele>0)
		   { 
			 arr[i]=ele;
		   }
		   else
		   {
			   z++;
			   break;
		   }
		}
		if(z==0)
		{
		
		for(int i=0;i<size;i++)
		{     int c=0;
			for(int j=0;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
				}
			}
	            if(c==1)
	            {
		          sum+=arr[i];
	            }
		}
		System.out.println(sum);
		}
		else
		{
			System.out.println("Element is nigative");
		}
		

	}

}
