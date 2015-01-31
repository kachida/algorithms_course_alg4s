package linkedlist;

public class Node {
	
	String data;
	Node link;
	
	Node a=null;
	
	public static void main(String args[])
	{
		Node n=new Node();
		Node temp=n.createNode("kanna");
		System.out.println(temp.data);
		temp=n.createNode("ppan");
		System.out.println(temp.data);

		temp=n.createNode("chidam");
		System.out.println(temp.data);
		temp=n.createNode("baram");
		System.out.println(temp.data);
		//n.printNode();
	}
	
	public Node createNode(String d)
	{
		Node temp=new Node();
		temp.data=d;
		if(a==null)
		{
		temp.link=a;
		return temp;
		}
		else
		{
			Node temp1=a;
			while(temp1.link!=null)
			{
				temp1=temp1.link;
			}
			temp1.link=temp;
			return temp;
		}
		
	}
	
	public void printNode()
	{
		Node temp1=a;
		String str;
		while(temp1.link!=null)
		{
			str=temp1.data;
			temp1=temp1.link;
			System.out.println(str);
			
		}
		
	}
	
	
	
	

}
