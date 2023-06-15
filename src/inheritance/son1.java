package inheritance;

public class son1 extends single
{
	String name;
	son1()
	{
		name="shital";
		System.out.println(familname );
	}
	void printdetails()
	{
		System.out.println("my name is " + name + " " + familname + " and i am from " + houseaddress);
		
	}
	public static void main(String[]args) 
	{
		son1 s=new son1();
		s.printdetails();
	}

}
