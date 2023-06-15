package collection;

import java.util.ArrayList;
import java.util.Collections;

public class exaple2_arraylist {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(102);
		a1.add(105.2);
		a1.add("shital");
		a1.add("null");
		a1.add("null");
		a1.add('s');
		a1.add(102);
System.out.println(a1);
a1.add(3,"svara");
System.out.println(a1);
a1.set(1, "sumit");
System.out.println(a1);
Collections.sort(a1);
	}

}
