package collection;

import java.util.ArrayList;

public class example5 {

	public static void main(String[] args) 
	{
		ArrayList arr1=new ArrayList();
		arr1.add(1201);
		arr1.add("shital");
		System.out.println(arr1.size());
	boolean b	=arr1.contains(1201);
	System.out.println(b);
	System.out.println(arr1.isEmpty());
	arr1.add(2,"Svara");
	System.out.println(arr1);
	arr1.set(0, 121);
	System.out.println(arr1);

		
		

	}

}
