package constructor;

public class Sample1 
{
	int num1;
    int num2;
    Sample1() // user define constructor without parameter
    {
    	num1=10; //initilise value to global variable 
    	num2=20;
    }
    public static void main(String[]args) 
    {
    	Sample1 s2=new Sample1();
    	s2.m1();
    	s2.m2();
    	System.out.println("Differtnt class constructor");
    	sample2 s1=new sample2();
    	s1.m3();
    	s1.m4();
   	}
    public void m1()
    {
    	System.out.println(num1+num2);
    	
    }
    public void m2()
    {
    	System.out.println(num1*num2);
    }


}
  