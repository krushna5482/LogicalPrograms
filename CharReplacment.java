package com.Qualifier.String;

import java.util.Scanner;

public class CharReplacment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		if(s.matches("[A-Za-z ]+"))
		{
			
		
		StringBuilder sb=new StringBuilder(s);
		System.out.println("Enter the char for searching");
		String ss=sc.next();
		char css=ss.charAt(0);
		int z=0;
		int check=0;
		int index=0;
		for(int i=0;i<s.length();i++)
		{
		  char c1=s.charAt(i);
		  if(c1==css)
		   {  
		     index=i;
		    check=1;
			 break;
			 
		   }
		  
		  
		}
		if(check==1)
		{
			System.out.println("Enter charchter for replacement");
			String c=sc.next();
			char r=c.charAt(0);
			sb.setCharAt(index, r);
			
		   System.out.println(sb);
			
		}
		else
		{
			System.out.println("Invalid char");
		}
		}
		else
		{
			System.out.println("Sentence is wrong");
		}
	}

}
