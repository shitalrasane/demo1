package collection;

import java.util.HashSet;
import java.util.Iterator;

public class sample_hashset {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("shital");
		hs.add(101);
		hs.add('a');
		hs.add(null);
		hs.add(45.5f);
		hs.add("shital");
		System.out.println(hs);
	
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.remove("shital");
		System.out.println(hs);
		
		
		Iterator tr=hs.iterator();
		while(tr.hasNext())
		{
			
			System.out.print(tr.next().hashCode()+" ");
			
			
			
		}
		
	//	for(Object o:hs)
		//{
			//System.out.println(o);
		//}
		//hs.clear();
		//                                         System.out.println(hs.size());
	//}

}
