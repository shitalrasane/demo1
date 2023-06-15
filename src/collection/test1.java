package collection;

public class test1 {
	int num1;
	int num2;
	test1()
	{
		num1=10;
		num2=20;
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void mul()
	{
		System.out.println(num1*num2);
	}

	public static void main(String[] args) 
	{
		test1 s1=new test1();
		s1.add();
		s1.mul();
		test2 s2=new test2();
		s2.squre();
		s2.qube();

	}

}
