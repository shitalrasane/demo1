package Program;

public class sample8 
{
int a;
sample8()
{
a=10;

}
void m1()
{
	
System.out.println(a*a*a);
}
public static void main(String[]args) 
{
sample8 s8=new sample8();
s8.m1();
System.out.println(s8.a);
}
}
