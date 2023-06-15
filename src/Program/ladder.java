package Program;

public class ladder 
{
public static void main(String[]args) 
{
	int marks=65;
	if(marks>=65)
	{
		System.out.println("Distiction");
		
	}
	else if(marks>=60 & marks<=64)  // 60 to 64
	{
		System.out.println(" 1st class");
		
	}
	else if(marks>=50 & marks<=59) // 50 to 59
	{
		System.out.println(" 2nd class");
		
	}
	else if(marks>=40 & marks<=49)  // 40 to 49
	{
		System.out.println(" 3rd class");
		
	}
	 if(marks>=35 & marks<=100) 
	{
	System.out.println("pass");	
	}
	 else
	 {
		System.out.println("fail");
		
	 }
	 
}
}
