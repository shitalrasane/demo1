package stringclass;

public class example11 {

	public static void main(String[] args) 
	{
   String s1 ="sh6i8ta7l";
   int sum=0;
   for(int i=0;i<=s1.length()-1;i++)
{
if(Character.isDigit(s1.charAt(i)))	
{
	int a=Character.getNumericValue(s1.charAt(i));
	System.out.println(a);
	sum =sum+a;
}
}
   System.out.println(sum);
	}

}
