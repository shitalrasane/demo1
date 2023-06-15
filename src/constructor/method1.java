package constructor;

public class method1 
{
    static int a=20;  //static global variable
	public static void main(String[] args)
	{

	  System.out.println(a);   // TODO Auto-generated method stub
	  m1();
	  method1 m3=new method1();
	  m3.m2();
	}
	public static void m1()
	{
		System.out.println(a);
	}
	public void m2()
	{
		System.out.println(a);
	}

}
