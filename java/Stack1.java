class Stack1
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	static class Stack
	{
		public Node head;
		public static boolean isEmpty()
		{
			return head==null;
		}
		public static void push(int data)
		{
			Node newNode =new Node(data);
			if(isEmpty())
			{
				head=newNode;
				return;
			}
			newNode.next =head;
			head=newNode;
		}
		public static void pop()
		{
			if(isEmpty())
			{
				return -1;
			}
			
			head=head.next;
			return top;
		}
		public static void peek()
		{
			if(isEmpty())
			{
				return -1;
			}
			int top =head.data;				
				return top;
		}
	public static void main(String []x)
	{
		//Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		//int  s1 =sc.nextInt(s.push);
		s.push(1);
		s.push(2);
		s.push(3);
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
	}
	}
}	