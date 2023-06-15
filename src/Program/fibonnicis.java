package Program;

public class fibonnicis 
{
public static void main(String[] args)
{
	int n=15,a=0,b=1;
	System.out.println("fibonnicies series till "+ n +"terms");
	for(int i=1;i<=n;++i)  
	{
		System.out.print(a + ",");
		int c=a+b;
		a=b;
		b=c;
		
	}
	
}
}
