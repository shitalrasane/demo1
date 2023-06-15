package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class example3_arraylist {

	public static void main(String[] args) 
	{
		ArrayList <Integer>a1=new ArrayList<Integer>();
		a1.add(110);
		a1.add(131);
		a1.add(181);
		a1.add(101);
		a1.add(111);
		a1.add(101);
		a1.add(121);
		a1.add(101);
		
		System.out.println(a1);
	Collections.sort(a1);
	System.out.println(a1);
	}

}
