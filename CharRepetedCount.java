package com.Qualifier.String;

import java.util.TreeSet;

public class CharRepetedCount {

	public static void main(String[] args) {
		String s="aabbbcccc";
		TreeSet<Object> tr=new TreeSet<Object>();
		int c=0;
		char c1;
		
		for(int i=0;i<s.length();i++) {
			   c=0;
			  
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					c++;
					
				}
				
			}
			
			String res=s.charAt(i)+""+c;
			tr.add(res);
			
		}
        for(Object s1:tr)
        {
        	System.out.print(s1);
        }
	}

}
