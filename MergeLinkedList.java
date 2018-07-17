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
public class MergeLinkedList
{
Node head;
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
public  Node sortedMerge(Node a, Node b)
{
	Node result=null ;
if (a==null)
	return b;
if(b==null)
	return a;

if(a.data<= b.data)
{
result=a;
result.next=sortedMerge(a.next,b);
}
else
{
	result=b;
	result.next=sortedMerge(a,b.next);	
}
return result;	
	
}


public static void main(String args[])
{
	MergeLinkedList llist1 = new MergeLinkedList();
	llist1.push(60);
	llist1.push(50);
	llist1.push(40);
	llist1.push(30);
	llist1.push(20);
	llist1.push(10);
	
	
	llist1.printList();
	
	System.out.println();
	
	MergeLinkedList llist2 = new MergeLinkedList();
	llist2.push(90);
	llist2.push(80);
	llist2.push(4);
	llist2.push(3);
	llist2.push(2);
	llist2.push(1);
	
	
	llist2.printList();

	System.out.println();
	
	MergeLinkedList llist3 = new MergeLinkedList();

	System.out.println();
	
	System.out.println("MergedList : --> ");
	System.out.println(llist1.head.data);
	System.out.println(llist2.head.data);
	llist3.head = llist3.sortedMerge(llist1.head, llist2.head);
	llist3.printList();
	
	
	
	
	
	
	
}
	
	

}
 
