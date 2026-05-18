package com.Qualifier.String;

import java.util.Arrays;
import java.util.Scanner;

public class WordsManuplations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
    String str=sc.nextLine();
   
    String z="";
    
   
    String arr[]=str.split(" ");
     
       for(int i=0;i<arr.length;i++)
       {
    	       for(int j=0;j<arr[i].length();j++)
    	       {
    	    	        z=z+arr[i].charAt(arr[i].length()-1);
    	    	        break;
    	    	        
    	       }
       }
   
       int index=0;
      
        char arr1[]=z.toCharArray();
       String orignal="";
       
       Arrays.sort(arr1);
       System.out.println(Arrays.toString(arr1));
       System.out.println();
       for(int i=0;i<arr.length;i++)
       {
    	       for(int j=0;j<arr[i].length();j++)
    	       {
    	    	   if(j==arr[i].length()-1)
    	    	   {
    	    	      
    	    	   orignal+=arr[i].replace(arr[i].charAt(j), arr1[index++]);
    	    	    orignal+=" ";
    	    	 
    	     }
    	     
       }
    	       }
       
       
       
       
       int c=0;
       for(int i=0;i<arr1.length;i++)
       {
    	    if(arr1[i]==z.charAt(i))
    	    {
    	    	   c=i;
    	    	   break;
    	    }
       }
       String result=arr[c];
       for(int i=arr[c].length()-1;i>=0;i--)
       {
    	   System.out.print(result.charAt(i));
       }
       System.out.println();
       System.out.println(orignal);
       
       
      
       
       
       
       
     

	}

}
