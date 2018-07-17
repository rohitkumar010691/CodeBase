package obs;

public class RerveseInGroup
{
	
Node head=null;
private Node h;
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
public void push(int new_data)
{
Node new_node= new Node(new_data);
new_node.next=head;
head=new_node;
}
public  void printList() {
	Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}

Node reverseK_Group(Node head, int k)
{
	int count=0;
	Node curr=head;
	Node prev=null;
	Node next=null;
	while(count<k && curr!=null)
	{
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
		count++;
		
	}
	
	if(next!=null)
		head.next=reverseK_Group(next,k);
	return prev;
}


public static void main(String args[])
{
	RerveseInGroup llist1 = new RerveseInGroup();
	llist1.push(70);
	llist1.push(60);
	llist1.push(20);
	llist1.push(10);
	llist1.push(50);
	llist1.push(30);
	llist1.push(40);
	
	
	llist1.printList();
	
	System.out.println();
	llist1.head=llist1.reverseK_Group(llist1.head,3);	
	System.out.println("MergedList : --> ");
	llist1.printList();
	
	
}
}
 
