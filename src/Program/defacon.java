package Program;

public class defacon 
{
int num1=30;
int num2=100;

public static void m3()
{
	defacon d2=new defacon();
	System.out.println(d2.num1+d2.num2);
}
public void m4()
{
	System.out.println(num1*num2);

}
public static void main(String[] args) 
{
	System.out.println("Arithmatic operation are");
	defacon d1=new defacon();
	m3();
	d1.m4();
	
}
}
