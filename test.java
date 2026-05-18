package com.Qualifier.Collection;
import java.util.*;

 public class test {
	 public static void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
	    MovieManager m=new MovieManager();
	     System.out.println("Enter the number of movies to be added");
	     int num=sc.nextInt();
	     System.out.println("Enter movie details(little:rating)");
	     for(int i=0;i<num+1;i++)
	     {
	    	 String str=sc.nextLine();
	    	 m.addMovieDetails(str);
	     }
	     
	     System.out.println("Enter the minimum rating");
	     double rating=sc.nextDouble();
	     
	     List<String> l1=m.getMoviesByRating(rating);
	     if(l1.isEmpty())
	     {
	    	 System.out.println("No movies were found with minimum rating of"+rating);
	     }
	     else
	    	 {
	    	 for(String s:l1)
		     {
	    		 System.out.println("Movies with a rating of at least "+rating);
		    	 System.out.println(s);
		     }
	    	 }
	     
	 }

}
 
 class MovieManager{
	 List<String> list=new ArrayList<>();
	 
		public void addMovieDetails(String movieDetails)
		{
			
			//String details[]=movieDetails.split(":");
			
			list.add(movieDetails);
		}
		public List<String> getMoviesByRating(double minRating)
		{
			List<String> list1=new ArrayList<>();
			int c=0;
			for(int i=1;i<list.size();i++)
			{     String s1=list.get(i); 
			      String ss[]=s1.split(":");
			      String movie=ss[0];
			      double num=Double.parseDouble(ss[1]);
			      //System.out.println(ss[1]);
			  
				if(num>=minRating)
				{
				   list1.add(movie); 	
				}
				
				
			}
			return list1;
			
			
		    	
		}
 }
