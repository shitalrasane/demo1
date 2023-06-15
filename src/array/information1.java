package array;

public class information1 
{ 
	public static void main(String[] args)
	{
		int ar1 []=new int [4];
		ar1[0]=20;
		ar1[1]=21;
		ar1[2]=22;
		ar1[3]=23;
		
		System.out.println(ar1.length);
		System.out.println(ar1[0]);
		System.out.println("------printing all information------");
		for(int i=0;i<=ar1.length-1;i++)
		{
			System.out.println(ar1[i]);
		}
	}

}
