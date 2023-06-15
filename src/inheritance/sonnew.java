package inheritance;

public class sonnew extends fathernew 
{
	sonnew()
	{
		System.out.println("i m son extends from fathernew");
	}
public static void main()
{
	sonnew s1=new sonnew();
	System.out.println(s1.name);
	System.out.println(s1.sirname);	
}
}
