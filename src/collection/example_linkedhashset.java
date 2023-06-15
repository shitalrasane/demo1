package collection;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class example_linkedhashset {

	public static void main(String[] args) 
	{
		LinkedHashSet hs1=new LinkedHashSet();
		hs1.add("shital");
		hs1.add(105);
		hs1.add(90.50);
		hs1.add('A');
		hs1.add(108);
		hs1.add("sumit");
		hs1.add("shital");
		hs1.add(null);
		hs1.add(null);
		System.out.println(hs1);
		hs1.remove ("shital");
		
		System.out.println(hs1);
		Iterator itr=hs1.iterator();
		System.out.println("--------------printing data of linkedhashset---------- ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-----print data by for each loop------");
		for(Object s1:hs1)
		{
			System.out.println(s1);
		}
hs1.clear();
System.out.println(hs1.size());
	}

}
