package array;

import java.util.Arrays;

public class informatio2 
{
	public static void main(String[] args) 
	{
		String ar[]=new String[4];
		ar[0]="Shital";
		ar[1]="Advik";
		ar[2]="Ramesh";
		ar[3]="Nikita";
		System.out.println(ar[2]);
		Arrays.sort(ar);
		for(int i=0;i<=3;i++)
		{
			System.out.println(ar[i]);
			
		}
		System.out.println("array of accending order");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
			
		}
		System.out.println("array of decending order");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	
		
		}
	}


