package com.Qualifier.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ElictricityBoard {
      private Map<String,String>electricity=new HashMap<>();
      
	 
	public Map<String, String> getElectricity() {
		return electricity;
	}


	  public void setElectricity(Map<String, String> electricity) {
		  this.electricity = electricity;
	  }

	  public int findCount(String ct)
	  {
		  int c=0;
		  
		  for(Map.Entry<String, String> e: electricity.entrySet())
		  {    
			  
			   String s=e.getValue();
			  if(s.equalsIgnoreCase(ct))
			  {
				c++;
			  }
			  
		  }
		  return c;
		     
		 
	  }
	  public List<String>findconnectionID(String connetionType)
	  {
		   List<String> list=new ArrayList<>();
		  for(Map.Entry<String, String> e: electricity.entrySet())
		  {    
			  String ss=e.getValue();
			  if(ss.equalsIgnoreCase(connetionType))
			  {
				 list.add(e.getKey()); 
			  }
		  }
		  return list;
		                
	  }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ElictricityBoard e=new ElictricityBoard();
		   System.out.println("Enter the number of connection records to be added");
		   int size=sc.nextInt();
		   System.out.println("Enter the connection records (Connection Id : Connection type)");
		   for(int i=0;i<size;i++)
		   {
			    String input=sc.next();
			    String arr[]=input.split(":");
			    e.electricity.put(arr[0], arr[1]);
			    
			    
		   }
		   System.out.println("Enter the Connection type to be searched");
		   String ss=sc.next();
		   int cc=e.findCount(ss);
		   if(cc==0)
		   {
			   System.out.println("No Connection Ids were found for the standard");
		   }
		   else
		   {
		   System.out.println("The count of connection Ids based on SINGLE are "+cc);
		   System.out.println("Enter the Connection type to identify the Connection Ids");
		   String conns=sc.next();
		   System.out.println("Connection Ids based on the "+conns+" are");
		  List<String> ll= e.findconnectionID(conns);
		  System.out.println(ll);
		   }
		
	}

}

