package com.Qualifier.String;

public class StringT {

	public static void main(String[] args) {
		String input="a2b3c4";
		for(int i=0;i<input.length();i++)
		{
			 char c1=0;
			char check=input.charAt(i);
			//if(input.charAt(i).isDigit())
			if(Character.isAlphabetic(check))
			{
				c1=check;
			}
				if(Character.isDigit(check))
				{
					 int num=check-'0';
					 System.out.println(num);
					 for(i=0;i<num;i++)
					 {
						 System.out.println(c1);
					 }
					
				}
				
					
			  
		}
		
		

	}

}
