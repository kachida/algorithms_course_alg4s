/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		//kadane algorithm
		
		int a[]={1,-3,2,-5,7,6,-1,-4,11,-23};
		int temp=0,sum=0;
		int ans=0;
		for(int i=0;i<a.length-1;i++)
		{
			//sum=0;
			if(sum+a[i]>0)
			{
				sum=sum+a[i];
			}
			else
			{
				sum=0;
			}
			ans=Math.max(sum,ans);
		}
		System.out.println(ans);
		
	}
}