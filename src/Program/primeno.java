package Program;

public class primeno 
{
	public static void main(String[]args)
	{
		int m=0,flag=0;
		int n=21;  //it is no to be checked
	     m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n+" is not prime no");
			
		}else {
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+"is not prime no");
					flag=1;
					break;
				}
			}if(flag==0)
			{
				System.out.println(n+"is prime no");
			}
		}
	}
	
	

}
