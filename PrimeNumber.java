package java_programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//  Check if a number is prime
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("Given Number is Prime Number");
		}
		else
		{
			System.out.println("Given Number is not prime number");
		}
				

	}

}
