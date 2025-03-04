package java_programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
//		Check if a given year is a leap year.

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year: ");
		int year=sc.nextInt();
		
		 
        if ((year%400==0) || (year%4==0 && year%100!=0))
		{
			System.out.println("Given year is leap year");
		}
		else
		{
			System.out.println("Given year is not leap year");
		}
	}

}
