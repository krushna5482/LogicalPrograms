package java_programs;

public class FactorialNumber {

	
	public static int factorial(int n) {
        if (n==0 || n==1)
        {
            return 1; 
        }
        else 
        {
            return n * factorial(n - 1); // Recursive call
        }
    }
	public static void main(String[] args) {
		
		// Find the factorial of a number using recursion
		FactorialNumber f=new FactorialNumber();
		 int num=5;
		 int result=f.factorial(num);
		
		 System.out.println("Factorial of "+num+" is: "+result);
		
		
		
		

	}

}
