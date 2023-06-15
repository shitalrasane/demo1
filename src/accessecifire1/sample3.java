package accessecifire1;

public class sample3
{
	public int c;
	public sample3()
	{
		c=30;
	}
public void m1()
{
	System.out.println(c*c);
}
public static void main(String[] args) 
{
sample3 s=new sample3();
s.m1();
System.out.println(s.c);
}
}
