package com.Qualifier.String;

public class StringManupalation {
	
	

	public static void main(String[] args) {
		String s="Hello world";
        String w="World";
        
        String arr[]=s.split(" ");
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
        	   if(arr[i].equals(w))
        	   {
        		   c++;
        	   }
        }
        System.out.println(c);
	}

}
