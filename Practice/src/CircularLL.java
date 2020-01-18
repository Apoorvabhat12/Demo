import java.util.Scanner;

public class CircularLL {

	Scanner scan = new Scanner(System.in);
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
			p.link=first;
		}
		
		else
		{
			p.link=first;
			temp=first;
			while(temp.link!=first)
			{
				temp=temp.link;
			}
			temp.link=p;
			first=p;
			
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
				
				if(temp==first)
				{
					break;
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLL cc = new CircularLL();
		cc.insertFront(1);
		cc.insertFront(2);
		cc.insertFront(3);
		cc.display();

	}

}
