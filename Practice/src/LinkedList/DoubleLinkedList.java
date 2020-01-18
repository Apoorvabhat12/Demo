package LinkedList;

public class DoubleLinkedList {

	class Node
	{
		int data;
		Node link;
		
		
		Node(int data)
		{
			this.data=data;
			this.link=null;
			
		}
	}
	Node first,temp;
	
	void insertFront(int data)
	{
		Node p = new Node(data);
		
		if(first==null)
		{
			first=p;
		}
		else
		{
			p.link=first;
			
			first=p;
		}
		
	}
	
	void reverse()
	{
		Node previous=null;
		Node current=null;
		temp=first;
		
		while (temp != null) {
		      current = temp;
		      temp = temp.link;

		      // reverse the link
		      current.link = previous;
		      previous = current;
		      first = current;

	}
	}
	void display()
	{
		if(first==null)
		{
			System.out.println("Nothing");
		}
		else
		{
			temp=first;
			while(temp!=null)
			{
				System.out.println(temp.data + " ");
				temp = temp.link;
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList db = new DoubleLinkedList();
		db.insertFront(10);
		db.insertFront(20);
		db.insertFront(30);
		//db.display();
		db.reverse();
		db.display();
	}

}
