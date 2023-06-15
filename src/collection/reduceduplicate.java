package collection;

import java.util.HashSet;

public class reduceduplicate {

	public static void main(String[] args)
	
	
	{
       String s1="sbvghgskdresfthgb";
		char[]arr1=s1.toCharArray();
		
		HashSet hs=new HashSet();
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			hs.add(arr1[i]);
			
		}
		for(Object o:hs)
		{
			
			
			System.out.print(o);
		}
		
		
		
		
		

	}

}
