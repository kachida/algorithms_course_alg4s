package quickunion;
import java.util.Scanner;
import java.util.Scanner;





public class QuickUnion {
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
	public int root(int i)
	{
		while(i!=id[i])
		{
			i=id[i];
		}
		return i;
	}
	public boolean connected(int p,int q)
	{
		return root(p)==root(q);
	}
	public void union(int p,int q)
	{
		int pid=root(p);
		int qid=root(q);
		id[pid]=qid;
	}
	
}