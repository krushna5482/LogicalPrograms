package java_programs;

public class SumOfDigit {

	public static void main(String[] args) {
		
//		Find the sum of digits of a number
		
		int num=23458;
        int n;
        int sum=0;
		while(num>0)
		{
		   n=num%10;	
		   sum+=n;
		   num/=10;
		}
		System.out.println("Sum of digits of a number:"+sum);		
	}

}
