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
public class swap2Nodes
{
Node head;
public void push(int new_data)
{
Node new_node= new Node(new_data);
new_node.next=head;
head=new_node;
}


void printList(Node node) {
    while (node != null) {
        System.out.print(node.data + " ");
        node = node.next;
    }
}

public void Swap(int x, int y)
{
    if (x==y)
    	return;
    Node prevX=null, curX=head;
    while(curX !=null && curX.data!=x)
    {
    	prevX=curX;
    	curX=curX.next;
    	
    }
    Node prevY=null, curY=head;
    while(curY !=null && curY.data!=y)
    {
    	prevY=curY;
    	curY=curY.next;
    	
    }
    if(curX==null || curY==null)
    	return;
    if(prevX!=null)
    	prevX.next=curY;
    else
    	head=curY;
    if(prevY!=null)
    	prevY.next=curX;
    else
    	head=curY;
    
    Node temp;
    temp=curX.next;
    curX.next=curY.next;
    curY.next=temp;
    
    
}

public static void main(String args[])
{
	swap2Nodes lc=new swap2Nodes();
	lc.push(1);
	lc.push(2);
	lc.push(3);
	lc.push(4);
	lc.push(5);
	lc.push(6);
	 System.out.println("Given Linked list");
     lc.printList(lc.head);
     lc.Swap(1,3);
     System.out.println("");
     System.out.println("swapped linked list ");
     lc.printList(lc.head);
}
	
	

}
 
