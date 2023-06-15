package array;

public class largenoarr 
{
public static void main(String[]args)
{ 
	int ar []=new int[4];
   
ar[0]=30;
ar [1]=20;
ar[2]=10;
ar[3]=40;
if(ar[0]>=ar[1])
{
	if(ar[0]>=ar[2])
	
	{
		if(ar[0]>=ar[3])
		{
			System.out.println(ar[0]);
	}
		else
	{
System.out.println(ar[3]);
	}
		
	}
	else {
		System.out.println(ar[2]);
		
	}

	
	}else 
	{if(ar[1]>=ar[2])
	{
		if(ar[1]>=ar[3])
		{
			System.out.println(ar[1]);
		}else
		{
			System.out.println(ar[3]);
		}
	}else
	{
		System.out.println(ar[2]);
	}
		
	}

 }
}

