package stacks;



public class Stack_Generics_Linked_List_Impl<Item> {

Node first=null;
	
	private class Node
	{
		Item item;
		Node next;
		
	}
	public boolean isEmpty()
	{
		return first == null;
		
	}
	
	public Item pop()
	{
		
		Item item=first.item;
		first=first.next;
		return item;
		
	}
	
	public void push(Item item)
	{
		Node oldfirst=first;
		first = new Node();
		first.item=item;
		first.next=oldfirst;
	}
	
}
