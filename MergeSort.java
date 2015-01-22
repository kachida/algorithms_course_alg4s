import java.util.*;
import java.lang.*;
import java.io.*;

//Merge Sort Alogrithm 
//@author Kannappan Chidambaram

class MergeSort
{
	public static void main (String[] args) 
	{
		// your code goes here
		int a[]={30,20,10,40,60,50};
		
		mergesort(a);
	
	}
	
	public static void mergesort(int a[])
	{
		int n=a.length;
		if(n<2)
		{
			return;
		}
		int mid=n/2;
		int l[]=new int[mid];
		int r[]=new int[n-mid];
		
		for(int i=0;i<mid;i++)
		{
			l[i]=a[i];
		}
		for(int i=mid;i<n;i++)
		{
			r[i-mid]=a[i];
		}
		mergesort(l);
		mergesort(r);
		merge(l,r,a);
		
		
	
		
	}
	
	public static void merge(int l[],int r[],int a[])
	{
		int nL=l.length;
		int nR=r.length;
		int nA=a.length;
		int i=0,j=0,k=0;
		while(i< nL && j< nR)
		{
			if(l[i]<=r[j])
			{
				a[k]=l[i];
				i++;
				
				
			}else
			{
				a[k]=r[j];
				j++;
				
			}
			k=k+1;
		}
		while(i<nL)
		{
			a[k]=l[i];
			i++;
			k++;
		}
		while(j<nR)
		{
			a[k]=r[j];
			j++;
			k++;
		}
		
	
		
		
		
	}
}