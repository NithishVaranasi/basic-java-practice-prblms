import java.util.*;
class LL
{
	Node head;
	class Node
	{
		//here we created node
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	//add at first
	public void addFirst(int data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
	}
	//add last
	public void addLast(int data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		Node currNode= head;
		while(currNode.next!=null)
		{
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	//deleteFirst
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		head=head.next;
		if(head==null)
		{
		head=null;
		}
	}
	//deleteLast
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		Node secLast=head;
		Node lastNode=head.next;
		while(lastNode!=null)
		{
			lastNode=lastNode.next;
			secLast=secLast.next;
		}
		secLast.next=null;
	}
	//print
	public void printList()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		Node currNode= head;
		while(currNode!=null)
		{
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
		}
		System.out.print("NULL");
		System.out.println();
	}
	public static void main(String []x)
	{
		Scanner sc =new Scanner(System.in);
		int s =sc.nextInt();
		int s1=sc.nextInt();
		int s2 =sc.nextInt();
		LL list=new LL();
		list.addFirst(s);
		list.addFirst(s1);
		list.addLast(s2);
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();
	}
}
	