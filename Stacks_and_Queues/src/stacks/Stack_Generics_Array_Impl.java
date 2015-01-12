package stacks;

public class Stack_Generics_Array_Impl<Item> {
	
	

		
		private Item[] s;
		private int N=0;
		public boolean isEmpty()
		{
			return N==0;
		}
		
		public Stack_Generics_Array_Impl(int capacity)
		{
			s=(Item[]) new Object[capacity];
		}
		public Item pop()
		{
			
			Item item=s[--N];
			s[N]=null;
			return item;
			
		}
		
		
		
		public void push(Item item)
		{
			s[N++]=item;
		}
	


}
