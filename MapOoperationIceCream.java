package com.Qualifier.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapOoperationIceCream {
	private Map<String,Integer> IceCreamMap=new HashMap<String,Integer>();
	 
	public Map<String, Integer> getIceCreamMap() {
		return IceCreamMap;
	}

	public void setIceCreamMap(Map<String, Integer> iceCreamMap) {
		IceCreamMap = iceCreamMap;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of IceCream details to be added");
        int num=sc.nextInt();
        MapOoperationIceCream m=new MapOoperationIceCream();
        System.out.println("Enter the IceCream details(IceCreamName:Price");
        for(int i=0;i<num;i++)
        {
        	  String details=sc.next();
        	  String arr[]=details.split(":");
        	  int price=Integer.parseInt(arr[1]);
        	  m.IceCreamMap.put(arr[0], price);
        }
        System.out.println("Enter a range to filter the IceCream details.");
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println("IceCream available within the price range $."+start+" and $."+end+" are");
        List<String> zz=m.filterIcecreamDetailsForGivenPricerange(start, end);
        for(String s:zz)
        {
        	System.out.println(s);
        }
        
        System.out.println("The IceCream with the lowest price is");
        Map<String,Integer>zzz=m.findTheChepest();
        System.out.println(zzz);
        
        
        
	}
	
	public List<String> filterIcecreamDetailsForGivenPricerange(int start,int end)
	{
		List<String> list=new ArrayList<>();
		for(Map.Entry<String,Integer> e:IceCreamMap.entrySet())
		{
			
				if(e.getValue()>start && e.getValue()<end)
				{
					list.add(e.getKey());
				}
			
		}
		return list;
		
	}
	
	public Map<String,Integer>findTheChepest()
	{
		String namechep="";
	   Map<String,Integer> chepest=new HashMap<String,Integer>();
	   int min=Integer.MAX_VALUE;
	   for(Map.Entry<String,Integer> e:IceCreamMap.entrySet())
		{
		   if(e.getValue()< min)
		   {
			   min=e.getValue();
			   namechep=e.getKey();
		   }
		}
	   chepest.put(namechep,min);
	   return chepest;
	}

}

//
