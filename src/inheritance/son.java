package inheritance;

public class son extends father
{
	son()
	{
 System.out.println("I am son ! i inherit from my father");

}
	public static void main(String[]args)
	{
		son s1=new son();
		System.out.println(s1.familyName);
		System.out.println(s1.houseAddress);
	}
}
