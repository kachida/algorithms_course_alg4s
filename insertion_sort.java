/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

//Insertion sort 
//@author kannappan
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]={60,50,20,10,40,30};
		
		int temp=0;
		int val=0,n=0;
	
	for(int i=1;i<a.length;i++)
	{
		temp=a[i];
		for(int j=i-1;temp<a[j]&&j>=0;j--)
		{
			a[j+1]=a[j];
			a[j]=temp;
			if(j==0)
			{
				break;
			}
			
		}
	}
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
	
	}
}