package java_programs;

public class SwapTwoNumber {

	public static void main(String[] args) {
		//Write a program to swap two numbers without using a third variable.
		
		int a=10;
		int b=20;
		System.out.println("Before a value is:"+a);
		System.out.println("Before b value is:"+b);
		a=a+b;//a=30
		b=a-b;//b=30-20;10
		a=a-b;//a=30-10;20
		System.out.println("----------------------");
		System.out.println("After a value is:"+a);
		System.out.println("After b value is:"+b);
		
		//Another way
		System.out.println("=======================");
		System.out.println("---->Another Way<-----");
		System.out.println();
		
		int m=5;
		int n=2;
		System.out.println("Before a value is:"+m);
		System.out.println("Before b value is:"+n);
		m=m*n;//n=10
		n=m/n;//m=2.5
		m=m/n;//n=3
		System.out.println("----------------------");
		System.out.println("After a value is:"+m);
		System.out.println("After b value is:"+n);
		
		

	}

}
