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
public class reverse_LL
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



public Node Reverse(Node list)
{
    if (list == null) return null; // first question

    if (list.next == null) return list; // second question

    // third question - in Lisp this is easy, but we don't have cons
    // so we grab the second element (which will be the last after we reverse it)

    Node secondElem = list.next;

    // bug fix - need to unlink list from the rest or you will get a cycle
    list.next = null;

    // then we reverse everything from the second element on
    Node reverseRest = Reverse(secondElem);

    // then we join the two lists
    secondElem.next = list;

    return reverseRest;
}

public static void main(String args[])
{
	reverse_LL lc=new reverse_LL();
	lc.push(1);
	lc.push(2);
	lc.push(3);
	lc.push(4);
	lc.push(5);
	lc.push(6);
	 System.out.println("Given Linked list");
     lc.printList(lc.head);
     lc.head = lc.Reverse(lc.head);
     System.out.println("");
     System.out.println("Reversed linked list ");
     lc.printList(lc.head);
}
	
	

}
 
