package obs;

public class MergeSort_List
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

Node getMid(Node h)
{
if(h==null)
	return h;
Node fast=h.next;
Node slow=h;
while(fast!=null)
{
fast=fast.next;
if(fast!=null)
{
	slow=slow.next;
	fast=fast.next;
}
}
return slow;
}

Node mergeSorting(Node h)
{
if (h==null || h.next==null)
	return  h;
Node mid=getMid(h);
Node midNext=mid.next;
mid.next =null;
Node l=mergeSorting(h);
Node r=mergeSorting(midNext);
Node sortList=sortedMerge(l,r);
return sortList;

}
public static void main(String args[])
{
	MergeSort_List llist1 = new MergeSort_List();
	llist1.push(60);
	llist1.push(20);
	llist1.push(10);
	llist1.push(50);
	llist1.push(30);
	llist1.push(40);
	
	
	llist1.printList();
	
	System.out.println();
	llist1.head=llist1.mergeSorting(llist1.head);	
	System.out.println("MergedList : --> ");
	llist1.printList();
	
	
}
}
 
