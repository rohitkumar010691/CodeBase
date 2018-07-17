package obs;
public class print_revList
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



public void Reverse_print(Node list)
{
	Node curr=list;
   if (curr==null)
	   return;
   Reverse_print(curr.next);
   System.out.print(curr.data+" ");
}

public static void main(String args[])
{
	print_revList lc=new print_revList();
	lc.push(1);
	lc.push(2);
	lc.push(3);
	lc.push(4);
	lc.push(5);
	lc.push(6);
	 System.out.println("Given Linked list");
     lc.printList(lc.head);
     System.out.println("");
     System.out.println("Reversed linked list ");
     lc.Reverse_print(lc.head);
}
	
	

}
 
