package com.Qualifier.Collection;
import java.util.*;
public class TestHashMap {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
	
		map.put(1,"Krushna");
		map.put(2,"Shivam");
		map.put(3,"kartik");
		
		map.get(1);
		
		for(Map.Entry<Integer, String> e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
			
		}

	}

}
