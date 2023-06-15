package constructor;

public class shital 
{
	int a;
	int b;
	shital()
	{
		a=10; // initilise value to the global variable
		b=30;
	}
	public static void main(String[] args) 
	{
		shital s1=new shital();
		s1.m1();
		s1.m2();
		

		
	}
	public void m1()
	{
		System.out.println(a+b);
		
	}
	public void m2()
	{
		System.out.println(a*b);
	}

}
