package java_programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		//Check if a number is a palindrome
		
		
		int num=121;
		int temp=num;
		int n=0;
		int r=0;
		while(num>0)
		{
			n=num%10;
			r=r*10+n;
			num/=10;
		}
       if(r==temp)
       {
    	 System.out.println("Palindrome Number");  
       }
       else
       {
    	   System.out.println("Not Palindrome Number");
       }
	}

}
