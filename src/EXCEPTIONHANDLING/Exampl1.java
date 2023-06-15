package EXCEPTIONHANDLING;

public class Exampl1 {

	public static void main(String[] args) 
	{
		int num1=10;
		int num2=5;
		int div=0;
		try
		{
			div=num1/num2;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception handle");
		}
		System.out.println(div);
		System.out.println("hi");

	}

}
