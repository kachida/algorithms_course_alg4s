package recursion;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		for(int i=1;i<=number;i++)
		{
			int res=fibo(i);
			System.out.print(res+",");
		}
		
	}
	public static int nu=0;
	public static int fibo(int number)
	{
		if(number <= 0)
		{
			return 0;
			//System.out.println("0");
			//break;
		}
		if(number == 1)
			
		{
			return 1;
			
			//System.out.println("1");
			
			
		}else
		{
			return fibo(number-1)+fibo(number-2);
			
			
			
			
		}
	}

}
