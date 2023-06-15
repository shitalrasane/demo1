package Program;

public class sample5 
{ 
	int a;
	int b;
	sample5()
	{
		a=10;
		b=20;
		
	}
public void addition()
{
	System.out.println(a+b);
	
}
public void multiplication()
{
  System.out.println(a*b);	
}
public static void main(String[]args) 
{
sample5 s5=new sample5();
s5.addition();
s5.multiplication();
}
}
