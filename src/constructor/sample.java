package constructor;

public class sample
{ 
	int num1;
    int num2;
    sample(int a,int b) // user define constructor with parameter
    {
    	num1=a; //assigning the value of local variable to global variable
    	num2=b;
     }
 public static void main(String[] args)
 {
	 sample s1=new sample(10,20);
	 s1.add();
	 s1.mul();
	 
 }
 public void add()
 {
	 System.out.println(num1+num2);
 }
 public void mul()
 {
	 System.out.println(num1*num2);
 }
 
}
