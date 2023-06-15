package Program;

public class conparameter
{
	int num1;
    int num2;
conparameter(int a,int b)
{
num1=a;
num2=b;
}
public void m1()
{
System.out.println(num1+num2);	
}
public void m2()
{
System.out.println(num1*num2);	
}
public static void main(String[]args) 
{
conparameter s1=new conparameter(10,20);
s1.m1();
s1.m2();
System.out.println("------------------------------");
conparameter s2=new conparameter(100,20);
s2.m1();
s2.m2();
System.out.println("------------------------------");
System.out.println("diff class parameter constructor");
conparameter1 s3=new conparameter1(20,5);
s3.m3();
}
}
