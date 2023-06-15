package constructor;

public class const3 
{
	int a;
	int b;
	const3(int e,int f)
	{
		a=e;
		b=f;
	}
	public void m2()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		System.out.println("hi");
		const3 c4=new const3(20,30);
		c4.m2();
		const3 c5=new const3(50,20);
		c5.m2();
	}

}
