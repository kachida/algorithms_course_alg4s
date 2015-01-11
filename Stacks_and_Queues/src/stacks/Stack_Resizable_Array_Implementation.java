package stacks;

public class Stack_Resizable_Array_Implementation {
	
	private String[] s;
	private int N=0;
	
	public boolean isEmpty()
	{
		return N==0;
	}
	
	public void push(String item)
	{
		if(N==s.length)
		{
			resize(2*s.length);
		}
		 s[N++]=item;
	}
	
	public String pop()
	{
		String item=s[--N];
		s[N]=null;
		return item;
	}
	public void resize(int capacity)
	{
		String copy[]=new String[capacity];
		for(int i=0;i<N;i++)
		{
			copy[i]=s[i];
		}
		s=copy;
	}
	
	

}
