package accessecifire1;

public class sample1 
{
	protected int i;
	protected sample1()
	{
		i=100;
	}
	protected void squre()
	{
		System.out.println("squre of i is "+i*i);
	}
	public static void main(String[] Args) 
	{
		sample1 s1=new sample1();
		s1.squre();
		System.out.println(s1.i);
	}

}
