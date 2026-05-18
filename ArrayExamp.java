package com.Qualifier.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayExamp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		String arr[]=new String[size];
		
		
	
		System.out.println("Enter Elements");
		                      
		for (int i = 0; i < size; i++) {
			String s=sc.next();
			arr[i]=s;
		}
		List<Integer> li=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			String s=arr[i];
			String s1[]=s.split(",");
			   li.add(Integer.parseInt(s1[0]));
			
			
		}
		
	    Collections.sort(li);
	   System.out.println(li.get(li.size()-1));
		
	
	}




	}


