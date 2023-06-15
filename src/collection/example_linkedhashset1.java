package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class example_linkedhashset1 
{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		LinkedHashSet lk=new LinkedHashSet();
		lk.add("shital");
		lk.add(105);
		lk.add(40.5);
		lk.add("svara");
		lk.add(105);
		lk.add(null);
		lk.add(null);
		System.out.println(lk);
		System.out.println(lk.size());
	boolean b=	lk.isEmpty();
	if(b)
	{
		System.out.println("Data sturcture is empty");
	}
	else
	{
		System.out.println("Data sturcture is not empty");
	}
	lk.remove(105);
	lk.add(478.2);
	System.out.println(lk);
    
	//System.out.println(lk);
	Iterator itr=lk.iterator();
	while(itr.hasNext())
{
		System.out.println(itr.next());
	}
	}
	


	}


