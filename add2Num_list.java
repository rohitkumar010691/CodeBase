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
public class add2Num_list
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



public Node add(Node a, Node b)
{
	Node temp=null,prev=null,result=null;
	int carry=0,sum=0;
	while(a!=null || b!=null)
	{
		
		sum=carry + (a!=null ? a.data: 0)+ (b!=null ? b.data:0);
		carry=sum >=10 ? 1:0;
		sum=sum%10;
		temp=new Node(sum);
		if(result==null)
			result=temp;
		else
			prev.next=temp;
		
		prev=temp;
		if(a!=null)
			a=a.next;
		if(b!=null)
			b=b.next;
		}
	if(carry>0)
		temp.next=new Node(carry);
	return result;
}

public static void main(String args[])
{
	add2Num_list lc=new add2Num_list();
	lc.push(1);
	lc.push(2);
	lc.push(3);
	lc.push(4);
	lc.push(5);
	lc.push(6);
	 System.out.println("Given Linked list");
     lc.printList(lc.head);
     add2Num_list lc1=new add2Num_list();
    lc1.push(1);
 	lc1.push(2);
 	lc1.push(3);
 	lc1.push(4);
 	lc1.push(5);
 	lc1.push(6);
     System.out.println("");
     System.out.println("sum of linked list ");
     Node s=lc.add(lc.head,lc1.head);
     lc.printList(s);
}
	
	

}
 
