package mock4;

public class fathernew extends grandfathernew
{
	String name;
   String sirname;
	fathernew()
	{
	name="shital";
	sirname="Rasane";
	System.out.println("i am father inherit from grandfather");
	}
	public static void main(String []args)
	{
		fathernew n=new fathernew();
		n.m1();
	}

}
