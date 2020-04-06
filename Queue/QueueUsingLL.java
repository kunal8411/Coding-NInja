package Queue;

public class Node<T> {
	
	T data;
	Node<T> next;
	public Node(T data) {
		this.data= data;
		next=null;
	}

}




package Queue;

public class QueueUsingLL {
	private Node<Integer> front;
	private Node<Integer> rear;
	private int size;
	public QueueUsingLL()
	{
		front= null;
		rear=null;
		size=0;
	}
	public boolean IsEmpty()
	{
		return (size==0);
	}
	public int size()
	{
		return size;
		
	}
	public int top()
	{
		return front.data;
		
	}
	public   void enqueu(int data)
	{
		Node<Integer> newnode= new Node<Integer>(data);
		
		if(front==null)
		{
			front=newnode;
			rear=newnode;
			rear.next=null;
			size++;
			return;
		}
		rear.next=newnode;
		newnode.next=null;
		size++;
		rear=rear.next;
		
	}
	public int dequeue()
	{
		int temp=front.data;
		front=front.next;
		size--;
		return temp;
		
		
	}
//	public static void main(String [] args)
//	
//	{
//		QueueUsingLL q=new QueueUsingLL();
//		q.enqueu(10);
//		q.enqueu(20);
//		q.enqueu(30);
//		q.dequeue();
//		System.out.println(q.top());
//	}
	
	
			
	

}
