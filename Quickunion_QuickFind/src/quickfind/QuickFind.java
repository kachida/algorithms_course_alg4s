package quickfind;

import java.util.Scanner;

public class QuickFind {
	private static int id[];
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int size;
		System.out.println("enter the array size");
		size=s.nextInt();
		 id=new int[size];
		int n;
		
		System.out.println("enter the n value");
		n=s.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
			id[i]=i;
		}
		
		
		
		
		
	}
	
	public boolean connected(int p,int q)
	{
		return id[p]==id[q];
	}
	
	public void union(int p,int q)
	{
		int pid=id[p];
		int qid=id[q];
		for(int i=0;i<id.length;i++)
		{
			if(id[i]==pid)
			{
				id[i]=qid;
			}
		}
	}

}
