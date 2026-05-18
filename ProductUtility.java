package com.Qualifier.Exception;

public class ProductUtility {
	public Product productDetails(String details) throws ProductInvalidException
	{
		int c=0;
		int s=0;
		String []arr=details.split(":");
		if(arr[0].matches("[0-9]{4}$mp"))
		{
			c++;
		}
		int count=Integer.parseInt(arr[3]);
		if(count>0)
		{
		s++;	
		}
		
		if(c==0)
		{
		   throw new ProductInvalidException("Invalid Product Id Exception");	
		}
		if(s==0)
		{
			throw new ProductInvalidException("Stock is not availabel");
		}
		if(arr.length!=5)
		{
			throw new ProductInvalidException("Invalid Product Details");
		}
		double price=Double.parseDouble(arr[4]);
		Product p=new Product(arr[0],arr[1],arr[2],count,price);
		return p;
		
		
		
	}
	

}
