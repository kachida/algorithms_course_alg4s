package stacks;

public class Stack_Array_Implementation {

	
	private String[] s;
	private int N=0;
	public boolean isEmpty()
	{
		return N==0;
	}
	public String pop()
	{
		
		String item=s[--N];
		s[N]=null;
		return item;
		
	}
	
	public void push(String item)
	{
		s[N++]=item;
	}
}
