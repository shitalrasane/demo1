package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class example_arraynhashset {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add("shital");
		a.add("svara");
		a.add(50.25);
		a.add(105);
		a.add(null);
		a.add("shital");
        a.add(null);
        a.add('A');
		System.out.println(a);
		HashSet hs=new HashSet(a);
		System.out.println(hs);
	}

}
