package collection;

import java.util.HashSet;
import java.util.Iterator;

public class example_hashs {

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("shital");
		hs.add(102);
		hs.add("shttrh");
		hs.add('a');
		hs.add(102);
		hs.add(null);
		hs.add(null);
		hs.add(12.2);
		hs.add("svara");
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.remove(102);
		System.out.println(hs);
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Object s:hs)
		{
			System.out.println(s);
		}
		hs.clear();
		System.out.println(hs.size());

		

	}

}
