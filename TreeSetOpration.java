package com.Qualifier.Collection;

import java.util.Scanner;
import java.util.TreeSet;

class PetInfo{
	
	TreeSet<String> petset=new TreeSet<>();
	
	public void addPetDetails(String details)
	{
	     petset.add(details);	
	}
	
	public TreeSet<String>filterPetsByAndBreed(int age,String bread)
	{
		TreeSet<String> newTree=new TreeSet<>();
		  for(String s:petset)
		  {
			  String arr[]=s.split(":");
			  int petage=Integer.parseInt(arr[2]);
			  if(petage<=age)
			  {
				  if(bread.equals(arr[1]))
				  {
					 newTree.add(arr[0]); 
				  }
			  }
		  }
		  return newTree;
	}
	
}



public class TreeSetOpration {

	public static void main(String[] args) {
		PetInfo p=new PetInfo();
               Scanner sc=new Scanner(System.in);
              System.out.println("Enter the number of pets to add:");
               int size=sc.nextInt();
               System.out.println("Enter pet details in the format (Name:Breed:AgeInMonths):");
               for(int i=0;i<size;i++)
               {
            	      String details=sc.next();
            	       p.addPetDetails(details);
               }
               System.out.println("Enter maximum age in months to filter");
               int maxage=sc.nextInt();
               System.out.println("Enter breed to filter:");
               String b=sc.next();
               System.out.println("Pets matching the criteria:");
              TreeSet<String> result= p.filterPetsByAndBreed(maxage, b);
              for(String s:result)
              {
            	  System.out.println(s);
              }
              
              
	}

}
