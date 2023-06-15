package mock6;

public class example1 
{
	
	public static void main(String []args)
	{
	int rev,temp,sum=0;
	int n=454;
	temp=n;

	while(n>0)
	{
	rev=n%10;
	sum=(sum*10)+rev;
	n=n/10;
	}
	System.out.println(sum);
if(temp==sum)
{
	System.out.println("given no is palindrom"+temp);
}
else
{
System.out.println("given no is not palindrom "+ temp);	
}






	}

}
