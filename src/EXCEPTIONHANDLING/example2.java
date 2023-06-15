package EXCEPTIONHANDLING;

public class example2 {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,};
		try {
			System.out.println(arr[6]);
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bound exception handle");
		}
		
System.out.println("hi");
System.out.println("hello");
	}

}
