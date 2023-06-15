package collection;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("shital");
		a1.add(105);
		a1.add(45.5f);
		a1.add('A');
		a1.add(102);
		a1.add("shital");
		a1.add(null);
         a1.add(null);
         System.out.println(a1);
         System.out.println(a1.size());
         System.out.println(a1.isEmpty());
         System.out.println(a1.get(1));
         a1.add(4,105);
         System.out.println(a1);
         System.out.println(" " +a1.size());
	}

}
