package mock6;

public class sample5 {

	public static void main(String[] args) 
	{
	int	num1=add(10,50);
	System.out.println(num1);
	sample5 s5=new sample5();
	System.out.println(s5.mul(20,80));
	System.out.println(num1+s5.mul(20,30));
	System.out.println("---------------------------");
	sample6 s6=new sample6();
	String sname=s6.convertnameToUppercase("shital");
	System.out.println(sname);
	sample6 s11=new sample6();
	int t=s11.sub(50,20);
	System.out.println(t);
	}
public static int add(int a,int b)
{
int c=a+b;
return c;
}
public int mul(int c,int d)
{
	int m=c*d;
	return m;
}
}
