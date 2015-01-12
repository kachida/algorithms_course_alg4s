package Queues;

public class Queue_Linked_List_Implementation {
	
	
	Node first=null;
	Node last=null;
	Node oldlast=null;
	class Node
	{
		String item;
		Node next;
	}
	
	public boolean isEmpty()
	{
		return first==null;
	}
	
	public void enqueue()
	{
		
		Node oldlast=last;
		Node last=new Node();
		last.item="kanna";
		last.next=null;
		if(isEmpty())
		{
			first=last;
		}
		oldlast.next=last;
		
		
		
	}
	public String dequeue()
	{
		
		String item=first.item;
		first=first.next;
		if(isEmpty())
		{
			last=null;
		}
		return item;
	}

}
