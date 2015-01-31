package recursion;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Gcd is "+gcd(a,b));
		

	}
	
	public int remainder=Integer.MAX_VALUE;
	
	public static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(b,a%b);
			
		}
	}

}
