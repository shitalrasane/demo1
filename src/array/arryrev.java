package array;

public class arryrev {

	public static void main(String[] args) 
	{
		int[] arr=new int [] {12,58,621,46,20};
		System.out.println("original aary");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("reverse array");
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
	

	}

}
