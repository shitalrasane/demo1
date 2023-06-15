package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example1_arraylist {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add("shital");
		a.add(103);
		a.add("tejashri");
		a.add("shital");
		a.add("null");
		a.add("null");
		 System.out.println(a);
		 a.add(4,105);
		 System.out.println(a);
		  Iterator itr =a.iterator();
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
		  }
		  System.out.println(a.size());
		  a.remove(2);
		  System.out.println(a);
		  for(Object a1:a)
		  {
			  System.out.println(a1);
		  }
	
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
		}
	ListIterator litr=	a.listIterator();
	System.out.println("-------------------------------");
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	}

}
