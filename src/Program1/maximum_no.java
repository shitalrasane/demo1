package Program1;

import java.util.Scanner;

public class maximum_no 
{
	public static void main(String[]args)	
{
		int a;
		int b;
		int c;
		System.out.println("enter the first no:");
		System.out.println("enter the second  no:");
		System.out.println("enter the  no:");
		Scanner s1=new Scanner(System.in);
	a=s1.nextInt();
	b=s1.nextInt();
	c=s1.nextInt();
	if(a>b) 
	{
		if(a>c)
		{
			System.out.println("maximun no is : " +a);
		}
		else 
		{
			System.out.println("maximum no is : " +b);
		}
	}
	else {
		if(b>c)
		{
			System.out.println("maximum no is : " +b);
		}
		else
		{
			System.out.println("maximum no is :" +c);
		}
	}
		
		
	
}

}
