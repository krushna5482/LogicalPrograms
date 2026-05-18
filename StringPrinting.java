package com.day2;

public class StringPrinting {

	public static void main(String[] args) {
		String s="Shiavm is good friend";
		char w=' ';
		String rev="";
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(w==c)
			{
				for (int i1 = i+1; i1 < s.length(); i1++)
				{
					char c1=s.charAt(i1);
					
						//System.out.print(s.charAt(i1));
						
						if(c1==w)
						{
						break;	
						} 
						rev+=c1;
			     }
				break;
				
			} 
			//System.out.print(s.charAt(i));
			
		}
		for (int i =rev.length()-1; i >=0; i--) {
			System.out.print(rev.charAt(i));
			
		}
		

	}

}

//hello this is java