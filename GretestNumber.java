package java_programs;

import java.util.Scanner;

public class GretestNumber {

	public static void main(String[] args) {
//		 Find the greatest of three numbers.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+" is gretest Number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is gretest Number");
		}
		else
		{
			System.out.println(c+" is gretest Number");
		}

	}

}
