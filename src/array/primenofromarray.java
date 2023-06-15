package array;

public class primenofromarray {


	public static void main(String[] args) 
	{
		int m,flag=0;
		int n=13;
	m=n/2;
	if(n==0||n==1)
	{
		System.out.println("no is not a palindrom");
	}
	for(int i=1;i<=m;i++)//  6
	{
		if(n%i==0)
		{
		System.out.println("givn no is not prime no");
			flag=1;
		}
	}
		
		if(flag==0)
		{
			System.out.println("Given no is  palindrom no");
		}
	}
	
	}

