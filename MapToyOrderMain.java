package com.Qualifier.Collection;
import java.util.*;
public class MapToyOrderMain {
     private Map<String,Integer> toyMap=new HashMap<String,Integer>();
     
     public Map<String,Integer> getToyMap()
     {
    	 return toyMap;
     }
     
     public void setToyMap(Map<String,Integer> toyMap)
     {
    	    this.toyMap=toyMap;
     }
     
     public int findQuantity(String toyName)
     {
    	      int q=0;
    	    for(Map.Entry<String,Integer> e:toyMap.entrySet())
    	    {    
    	    	   String ss=e.getKey();
    	    	   if(toyName.equalsIgnoreCase(ss))
    	    	   {
    	    		  q=e.getValue();
    	    	   }
    	    	   else
    	    	   {
    	    		   q=-1;
    	    	   }
    	    }
    	    return  q;
     }
     
   public List<String> findtoys(int quantity)
   {
	   List<String> list=new ArrayList<>();
	   
     for(Map.Entry<String, Integer> e: toyMap.entrySet()) 
     {
    	 if(e.getValue()<=quantity)
    	 {
    		 list.add(e.getKey()); 
    	 }
     }
	 return list;
   }
     
     
     
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of records to be added");
		int size=sc.nextInt();
		System.out.println("Enter the toy details(toyName: quantity");
		MapToyOrderMain m=new MapToyOrderMain();
		for(int i=0;i<size;i++)
		{
			String details=sc.next();
			String arr[]=details.split(":");
			int q=Integer.parseInt(arr[1]);
			m.toyMap.put(arr[0], q);
		}
		//System.out.println(m.toyMap);
		System.out.println("Enter the toy name to be searched");
		String toyNAme=sc.next();
		int qq=m.findQuantity(toyNAme);
		System.out.println("Order placed for "+qq+" "+toyNAme);
		System.out.println("Enter the quantity to filter the toys");
		int qqq=sc.nextInt();
		
		List<String> l=m.findtoys(qqq);
		if(l.isEmpty())
		{
			System.out.println("No toys were found for the given quantity");
		}
		else
		{
			System.out.println("Toys that will be delivered on the same day are");
		
		for(String s:l)
		{
			System.out.println(s);
			
		}
		
	   }
	}
}
	
