package Program1;

public class example_methodretntype 
{
public   int add(int a,int b)
{
int c=a+b;
return c;
}
public  int mul()
{
 int d=this.add(10,20);
System.out.println(d*d);
return d;
}
public static void main(String[] args)
{
example_methodretntype s=new example_methodretntype();
s.mul();

}
}
