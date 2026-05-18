package com.day2;

import java.util.Scanner;

class TicketNotConfirmedException extends Exception
{
	 public TicketNotConfirmedException(String msg)
	 {
		super(msg); 
	 }
	 
	 
}	
	





class Ticket
{
	private String passengerName;
	private String status;
	
	public Ticket(String passengerName,String status)
	{
		this.passengerName=passengerName;
		this.status=status;
	}
	public void makePayment() throws TicketNotConfirmedException
	{
		if(this.status.equalsIgnoreCase("confirmed"))
		{
		System.out.println("Payment successful for "+passengerName+" ticket.");
		}
		if(this.status.equalsIgnoreCase("waiting"))
		{
			 throw new TicketNotConfirmedException("Payment can only be made when the ticket is confirmed. Current status: Waiting");
		}
		
		
			
		}
			
		
	}
public class Test {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println();
		Ticket confirmedTicket = new Ticket("Vedant", "Confirmed");
		Ticket waitingTicket = new Ticket("Mounika", "Waiting");
		
		
		
		try {
		confirmedTicket.makePayment();
		waitingTicket.makePayment();
		}
		catch (TicketNotConfirmedException e1)
		{
		System.out.println("Caught an exception: " + e1.getMessage() );
		}

	}

}
