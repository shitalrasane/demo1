package constructor;

public class conschain 
{
	int rollno;
	String course,sname;
	float fee;
	conschain(int rollno,String course,String sname)
	{
	this.rollno=rollno;
	this.sname=sname;
	this.course=course;
		
	}
	conschain(int rollno,String course,String sname,float fee )
	{
		this(rollno,course,sname);
		this.fee=fee;
	
	}
	public void m() {
		System.out.println(sname+" "+rollno+" "+course+" "+fee+" ");
	}
	
	
		
		
		
		
	
	public static void main(String[]args)
	{
		conschain k=new conschain(21,"software testing","shital",42000); 
		k.m();
	}

}
