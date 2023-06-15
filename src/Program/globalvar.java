package Program;

public class globalvar 
{
	int b=20;//non static global variable
	public static void main(String[]args) 
	{
		globalvar g1=new globalvar();//create an object of current class
		System.out.println(g1.b);// variable call
		System.out.println("Hello");
		m1();
		g1.m2();
	}
	public static void m1()
	{
		globalvar g2=new globalvar(); //create an object of current class
		System.out.println(g2.b);// variable call
	}
	public void m2()
	{
		System.out.println(b);// variable call in non satic method
	}

}
