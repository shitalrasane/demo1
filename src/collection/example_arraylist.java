package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class example_arraylist {

	public static void main(String[] args) 
	{
ArrayList a1=new ArrayList();
a1.add("shital");
a1.add(105);
a1.add(15.5);
for(Object s1:a1)
{
	System.out.println(s1);
	}
Iterator itr=a1.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}

	}

}
