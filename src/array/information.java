package array;

public class information 
{
	public static void main (String[]args)
	{
		String ar []=new String[5]; // array declairation 
		ar[0]="ganesh";
		ar[1]="Ramesh";  // array initilization
		ar[2]="shital";
		ar[3]="svara";
		ar[4]="Advik";
		System.out.println(ar.length);  // inbuilt function of length
		System.out.println(ar[0]);
		System.out.println(ar[3]);  // array usage
		System.out.println("-----------printing all information-----------");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
			
		}
	}

}
