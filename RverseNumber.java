package java_programs;

public class RverseNumber {

	public static void main(String[] args) {
		
//		Reverse a given number.
		int num=12345;
		int n;
		while(num>0)
		{
			n=num%10;
			System.out.print(n);
			num/=10;
		}

	}

}
