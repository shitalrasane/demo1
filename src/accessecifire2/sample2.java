package accessecifire2;

import accessecifire1.sample1;

public class sample2 extends sample1
{
	public void m1()
	{
		//sample2 s=new sample2();
		System.out.println(i);
	}
	public static void m2()
	{
		sample2 s=new sample2();
		System.out.println(s.i);
	}

	public static void main(String[] args) 
	{
		sample2 s2=new sample2();
		s2.squre();
		System.out.println(s2.i);
		s2.m1();
		m2();

	}

}
