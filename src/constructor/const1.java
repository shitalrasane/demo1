package constructor;

public class const1 
{
int a;
int b;
String s;
const1()
{
a=20;
b=50;
s="shital";
}
	public static void main(String[] args) 
	{
		const1 c1=new const1();
		c1.m3();
		c1.m3();
		const2 c2=new const2();
		 System.out.println(c2.c);
		// TODO Auto-generated method stub

	}
	public void m3()
	{
		System.out.println(a + " "+s+" " +b);
	}

}
