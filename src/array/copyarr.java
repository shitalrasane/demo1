package array;

public class copyarr {

	public static void main(String[] args) 
	{
		int [] arr1=new int[] {1,2,3,8,5};
		int [] arr2=new int[arr1.length];
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[i]=arr1[i];
			
		}
		System.out.println("element of original arry");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.println(arr1[i]+" ");
		}		
		System.out.println("--------------------");

		System.out.println("element of new arry");
	
			for(int i=0;i<=arr2.length-1;i++)
			{
				System.out.println(arr2[i]+" ");
			}
	

	}

}
