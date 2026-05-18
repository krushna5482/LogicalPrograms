package com.day2;

import java.util.Scanner;

class Bank
{
	
	public void openAccount(String accountType, double initialDeposit)
	{
		if(accountType.equalsIgnoreCase("Saving")  && initialDeposit>=5000)
		{
			System.out.println("Saving Account open Successfully.....");
		}
		else if(accountType.equalsIgnoreCase("current") && initialDeposit>=10000)
		{
			System.out.println("Current Account open Successfully.....");
		}
		else if(accountType.equalsIgnoreCase("Saving") && initialDeposit<=5000 || accountType.equalsIgnoreCase("current") && initialDeposit<=10000)
		{
			System.out.println("account not be opened because deposit is below the required threshold ");
		}
		else if(!accountType.equalsIgnoreCase("Saving") && !accountType.equalsIgnoreCase("current"))
		{
			System.out.println("Account is invalid....");
		}
	}
	
	public void applyLoan(double salary, int creditScore)
	{
		if(salary>=50000 && creditScore >=700)
		{
			System.out.println("approve a loan up to 10,00,000");
		}
		else if(salary>=30000 && creditScore >=650)
		{
			System.out.println("approve a loan up to 5,00,000");
		}
		else
		{
			System.out.println("reject the loan application due to insufficient salary or poor credit score");
		}
	}
	
	public void applyLoan(double salary, int creditScore, boolean hasCoApplicant)
	{
		if(hasCoApplicant=true && salary>=25000 && creditScore>=600)
		{
			System.out.println("approve a loan up to 4,00,000");
		}
		else if(salary>=50000 && creditScore >=700)
		{
			System.out.println("approve a loan up to 10,00,000");
		}
		else if(salary>=30000 && creditScore >=650)
		{
			System.out.println("approve a loan up to 5,00,000");
		}
		else
		{
			System.out.println("reject the loan application due to insufficient salary or poor credit score");
		}
		
	}
	
	public void createFixedDeposit(double amount, int years)
	{
		 if(amount>=10000)
		 {
			 System.out.println("FD is opened");
			 if(years>=5)
			 {
				 System.out.println("interest rate is 7.5%");
			 }
			 else if(years<=5)
			 {
				 System.out.println("interest rate is 6.5%");
			 }
			 
		 }
		 else
		 {
			 System.out.println("reject the FD creation");
		 }
			 
	}
	
	
	
	
}


public class BankDemo {

	public static void main(String[] args) {
		  Bank bank = new Bank();
	       
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a account type :");
	      String type=sc.nextLine();
	      System.out.println("Enter a initialDeposit :");
	      double iDeposit=sc.nextDouble();
	      bank.openAccount(type,iDeposit); 
	      
	      System.out.println("Enter a salary for normal loan :");
	      double sal=sc.nextDouble();
	      System.out.println("Enter a credit score :");
	      int cs=sc.nextInt();
	      bank.applyLoan(sal, cs);
	      
	      System.out.println("Enter a salary for co-loan :");
	      double sale=sc.nextDouble();
	      System.out.println("Enter a creditScore for co-loan : ");
	      int cs1=sc.nextInt();
	      System.out.println("Enter a hascoApplicant :");
	      boolean co=sc.nextBoolean();
	      bank.applyLoan(sale, cs1, co);
	      
	   
	      System.out.println("Enter a fd amount :");
	      double fd=sc.nextDouble();
	      System.out.println("Enter a years: ");
	      int y=sc.nextInt();
	      bank.createFixedDeposit(fd, y);
	      
	
	}

}
