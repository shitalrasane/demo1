package constructor;

public class usethis 
{
	public void m()
	{
		System.out.println("hello shital");
	}
	public void n()
	{
		System.out.println("Hi shital");
		this.m();
	}
	public static void main(String[] args)
	{
		usethis s=new usethis();
		s.n();
	}

}
