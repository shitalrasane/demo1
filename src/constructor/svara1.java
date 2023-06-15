package constructor;

public class svara1 extends svara
{
 int a=20;
 

	 public  void m1()
	 {
		 int a=10;
		 System.out.println(a);
		 System.out.println(this.a);
		 System.out.println(super.a);
	 }
	 public static void main()
	 {
		 
	 
 svara1 s1=new svara1();
 s1.m1();
}
 }
	 
	 
	 
