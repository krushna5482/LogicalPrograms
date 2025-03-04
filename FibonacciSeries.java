package java_programs;

public class FibonacciSeries {

	public static void main(String[] args) {
//		 Generate the Fibonacci series up to N terms.
		
		int firstnum=0;
		int secondnum=1;
		System.out.print(firstnum+" "+secondnum);
		
		for(int i=1;i<=5;i++)
		{   
			
			int num=firstnum+secondnum;
			System.out.print(" "+num);
			firstnum=secondnum;
			secondnum=num;
		}

	}

}
