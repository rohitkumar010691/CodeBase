package obs;

class Node
{
int data;
Node next;
   Node(int d)
  {
   data=d;
   next=null;
   }

}
public class linkedList_count
{
Node head;
public void push(int new_data)
{
Node new_node= new Node(new_data);
new_node.next=head;
head=new_node;
}

	public int get_count(Node node)
	{
		
		if (node==null)
			return 0;
		return 1+ get_count(node.next);
	}
	void printList(Node node) {
	    while (node != null) {
	        System.out.print(node.data + " ");
	        node = node.next;
	    }
	}	
public static void main(String args[])
{
	linkedList_count lc=new linkedList_count();
	lc.push(1);
	lc.push(2);
	lc.push(3);
	lc.push(4);
	lc.push(5);
	lc.push(6);
	
System.out.println("length="+ lc.get_count(lc.head));
	
}
	
	

}
 
