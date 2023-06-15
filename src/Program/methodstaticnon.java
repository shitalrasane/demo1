package Program;

public class methodstaticnon 
{
	public static void main(String[] args)
	{
	System.out.println("Hi");
	m1(); 
	methodstaticnon s1=new methodstaticnon();
	s1.m2();
	methodstaticnon1.m3();
	methodstaticnon1 d1=new methodstaticnon1();
	d1.m4();
	
	}
public static void m1()
{
System.out.println("Running static method : m1");	
}
public void m2()
{
System.out.println("Running non static method : m2");	
}
}
