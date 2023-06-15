package Program;

public class revstring 
{ 
	public static void main(String[]args) 
	{
		String origanal="hello";
		String reverse=" ";
		System.out.println("origanal string is "+origanal);
		for (int i=0;i<origanal.length();i++) 
		{
			reverse=origanal.charAt(i)+reverse;
			}
			
			System.out.print("reverse string is:"+reverse);
		
		
	}
}
