package collection;

import java.util.Collections;
import java.util.LinkedList;

public class example_linkedList {

	public static void main(String[] args) 
	{
		 LinkedList<String> cars = new LinkedList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.set(2,"NEXON");
		    cars.addFirst("shital");
		    cars.addLast("sumit");
		    System.out.println(cars.isEmpty());
		    // Use addLast() to add the item to the end
		    cars.addLast("Mazda");
		    System.out.println(cars);
		    Collections.sort(cars);
		    System.out.println(cars);
		    cars.addFirst("SWIFT");
		    System.out.println(cars);
		    cars.remove("SWIFT");
		    System.out.println(cars);
		    cars.removeLast();
		    System.out.println(cars);
		    //cars.getFirst();
		    System.out.println(cars.getFirst());
		    System.out.println(cars.getLast());
	}

}
