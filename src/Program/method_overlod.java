package Program;

public class method_overlod {

	public static void main(String[] args) 
	{
		//add(10,25,50);
		
	method_overlod m=new method_overlod();
		m.add(25,12,20);
	}
		public void add (int a,int b)
		{
			int c=a+b;
			System.out.println(c);
		}
		public void add (int a,int b,int c)
		{
			System.out.println(a+b+c);
		}
	

	}


