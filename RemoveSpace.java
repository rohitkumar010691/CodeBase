package obs;

public class RemoveSpace {
public static void main(String args[])
{
	String str="Hi this is me    ";
	String ans="";
	String [] wts=str.split(" ");
	for(String s:wts)
		ans+=s;
	System.out.println(ans);
}
}
