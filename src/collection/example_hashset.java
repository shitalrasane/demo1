package collection;

import java.util.HashSet;
import java.util.Iterator;

public class example_hashset {

	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add("shital");
		hs.add(103);
		hs.add(89.50f);
		hs.add('A');
		hs.add("SHITAL");
		
		System.out.println(hs);
		hs.remove('A');
	
		System.out.println(hs);
		System.out.println("-----------printing data of hashset---- " );  
		Iterator itr=hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println("--------------------");
		for(Object s1:hs)
		{
			
			System.out.println(s1);
		}
		
		
System.out.println(hs.size());
System.out.println(hs.isEmpty());
hs.remove("shital");
		System.out.println(hs);

	}



}
