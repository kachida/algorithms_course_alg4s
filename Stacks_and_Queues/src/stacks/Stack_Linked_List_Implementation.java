package stacks;

public class Stack_Linked_List_Implementation {
	Node first=null;
	
	private class Node
	{
		String item;
		Node next;
		
	}
	public boolean isEmpty()
	{
		return first == null;
		
	}
	
	public String pop()
	{
		
		String item=first.item;
		first=first.next;
		return item;
		
	}
	
	public void push(String item)
	{
		Node oldfirst=first;
		first = new Node();
		first.item="kanna";
		first.next=oldfirst;
	}

}
