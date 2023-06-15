package Program;

public class staticvar 
{
	static int a=10;
	int b=30;
	
	public static void main(String[]args)
	{
		System.out.println(a);
		m1();
		staticvar s1=new staticvar();
			s1.m2();
		
	}
	public static void m1()
	{
		System.out.println(a);
		staticvar s3=new staticvar();
		System.out.println(s3.b);
		
	}
	public void m2()
	{
		System.out.println(a);
		System.out.println(b);
		
	}

}
