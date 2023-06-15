package array;

public class dublicateElement {

	public static void main(String[] args) 
	{
	int [] arr=new int [] {1,2,5,4,2,4,5,6};
	System.out.println("Dublicate element in given arry");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=i+1;j<=arr.length-1;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[j]);
			}
		}
		
	}

	}

}
