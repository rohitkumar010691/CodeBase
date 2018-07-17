package obs;

import java.util.HashMap;
import java.util.Map;

public class maps {

	
	public static void main(String args[])
	{
		
		HashMap<Character, Integer> h= new HashMap<Character, Integer>();
		h.put('a',1);
		h.put('b',1);
		h.put('c',1);
		h.put('d',1);
		h.put('e',1);
		h.put('f',5);
		h.put('g',1);
		h.put('g',1);
		h.put('h',1);
		
		System.out.println(h);
		
		for (Character c: h.keySet())
		{	System.out.println("key="+c+"value="+h.get(c));
		if(h.get(c)>1)
			System.out.println("more then one value key="+c+"value="+h.get(c));
		   
		}
		for (Integer c: h.values())
			System.out.println(c);
		
		for(Map.Entry<Character, Integer> entry : h.entrySet())
			System.out.println("key="+entry.getKey() +" value="+ entry.getValue() );
		
	}
}
