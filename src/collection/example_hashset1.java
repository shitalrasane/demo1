package collection;

import java.util.HashSet;

public class example_hashset1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("shital");
		hs.add(null);
		hs.add(15.2f);
		hs.add("shital");
		hs.add(103);
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	hs.remove(null);
	System.out.println(hs);

	}

}
