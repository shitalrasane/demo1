package Program;

public class sample7 
{  
	private int a;
     private sample7()
{
  a=10;
  
}
private void printsquare()
{
System.out.println(a*a);
}
public static void main(String[] args)
{ 
	sample7 s2=new sample7();
    s2.printsquare();
	
}


}
