package java_programs;

public class ArrayMinMaxElement {

	public static void main(String[] args) {
//		 Find the largest and smallest number in an array.
		
		int arr[]= {1,2,3,4,9,6,7};
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max Element in Array:"+max);
		
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Min Element in Array:"+min);
		

	}

}
