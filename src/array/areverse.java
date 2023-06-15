package array;

public class areverse {

	public static void main(String[] args) 
	{
		int [] arr=new int[] {1,5,9,2,4,7};
		System.out.println("original arry");
	
		for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" " );
	}
		System.out.println();
	 System.out.println("reverse arry" );
	 
	 for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
	
	

	}

}
