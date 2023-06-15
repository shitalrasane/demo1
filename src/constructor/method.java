package constructor;

public class method 
{ 
int a=10;  // gloable  non static variable
public static void main(String[]args) 
{
method m1=new method();
	System.out.println(m1.a);
	m1.m2();
	m1.m3();

} public void m2()
{
	System.out.println(a);
	
}
public static void m3()
{
	method m2=new method();
System.out.println(m2.a);	
}

}
