package EXCEPTIONHANDLING;

public class example3 {

	public static void main(String[] args) 
	{
		String a1="velocity";
		try
		{
			System.out.println(a1.charAt(10));
		}
catch(StringIndexOutOfBoundsException e)
		{
	System.out.println("string index out of bound exception handle");
		}
		System.out.println("hi");
		System.out.println("hello");
	}

}
