package array;

public class muldarry 
{
public static void main(String[]args)
{
	int ar [][]=new int[2][3]; // 2row 3cololum
	ar[0][0]=20;
	ar[0][1]=30;
	ar[0][2]=10;
	ar[1][0]=40;
	ar[1][1]=50;
	ar[1][2]=70;
	System.out.println(ar[1][2]);
	System.out.println("------print all informayion-----");
	for(int i=0;i<=1;i++)
	{
		for(int j=0;j<=2;j++)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println("");
	}
	
	
	
}
}
