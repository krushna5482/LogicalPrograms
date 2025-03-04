package PK_HefshineString;

public class CharacterFrequency {

	public static void main(String[] args) {
		String s="Madam";
		for(int i=0;i<s.length();i++)
		{	int n=0;
			for(int j=0;j<s.length();j++)
			{
			   //char ch=s.charAt(cnt);
			   if(s.charAt(i)==s.charAt(j))
			    {
				  n++;
			    }
		    }
			 System.out.println(s.charAt(i)+" = "+n);
	
		 }
	}
}

