package com.Qualifier.Collection;
import java.util.*;
public class HashMapOperation {
        
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        
        
        
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
        	int key=sc.nextInt();
        	String s=sc.next();
        	 map.put(key, s) ;
        }
      
       
       int n= UserMAinCode.fourmultily(map);
        
       System.out.println(n);
	}

}


class UserMAinCode{
	public static int fourmultily(HashMap<Integer,String> map1)
    {      
//		System.out.println(map1.remove(4));
		
		List<Integer> re=new ArrayList<Integer>();
  	         
    			for(Map.Entry<Integer, String> e:map1.entrySet())
  	         {
  	        	      if(e.getKey()%4==0)
  	        	      {
  	        	    	     re.add(e.getKey());
  	        	      }    
  	         }
  	         
				for(Integer num:re) {
					map1.remove(num);
				}
				return map1.size();
    }
	
}