package java_programs;

public class ReverseArray {

	public static void main(String[] args) {
	//	Reverse an array.
	int arr[]= {2,3,4,5,6,7};
	System.out.println("Orignel Array:");
	for (int i=0;i<=arr.length-1;i++) 
	{
	  System.err.print(arr[i]+" ");	
	}
	System.out.println();
	System.out.println("Reverse Array:");

	for (int i=arr.length-1;i>=0;i--) 
	{
	  System.err.print(arr[i]+" ");	
	}
	}

}
