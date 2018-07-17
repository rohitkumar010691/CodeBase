package obs;

public class string_rev {

	public static void rev(String str, int lastchar)
	{
		System.out.print(str.charAt(lastchar));
		if(lastchar!=0)
		{
			rev(str,lastchar-1);
			
		}		
	}
	
	public static void main(String args[])
	{
	String str="abcdef";
	rev(str,str.length()-1);
	
	}
	
}
