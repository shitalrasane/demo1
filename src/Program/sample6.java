package Program;

public class sample6 
{
int a;
int b;
sample6() //constructor is create for initilizing value to global variable
{
	a=40;
	b=220;
}
public void m3()
{
	System.out.println(a+b);
}
public void m4() 
{
System.out.println(a*b);	
}
public static void main(String[] args)
{
sample6 s6=new sample6();
s6.m3();
s6.m4();
}
}
