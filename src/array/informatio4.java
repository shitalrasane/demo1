package array;

import java.util.Arrays;

public class informatio4 
{
	public static void main(String[]args)
	{
		String ar []= {"shital","svara","advik","nikita","ganesh" ,null}; // initilization and declairation in one line
		ar[5]="sanket";
		System.out.println(ar.length);
		System.out.println(ar[2]);
		System.out.println("------print all information------");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
 Arrays.sort(ar);
	System.out.println("----------sortede array-----------");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	}

}
