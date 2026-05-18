package com.Qualifier.String;

import java.util.Scanner;

public class PrefixString {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Size");
	  int size=sc.nextInt();
	  System.out.println("Enter words");
	  String words[]=new String[size];
	  for(int i=0;i<size;i++)
	  {
		 words[i]=sc.next(); 
	  }
	 String m="";
	  for(int i=0;i<words[0].length();i++)
	  {
		  String s=words[0].substring(0, i);
		 for(int i1=0;i1<words[1].length();i1++)
		 {
			 String s1=words[0].substring(0, i);
			 if(s.equals(s1))
			 {
				m+=s; 
			 }
		 }
		 
	  }
	  System.out.println(m);
	  
	}

}
