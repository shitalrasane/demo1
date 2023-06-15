package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class example_vector {

	

	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<String>();
		v.add("shita");
		v.add("Svara");
		v.add("null");
		v.add("shita");
	//	v.add(102);
		//v.add("s");
		String s=v.get(0);
		System.out.println(v);
		Object s1=v.set(2, "b");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(v);
Enumeration enu= v.elements();

while(enu.hasMoreElements())
{
System.out.println(enu.nextElement());	
}
Iterator itr=v.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	}
for(Object s2 :v)
{
System.out.println(s2);	
}
	}

}
