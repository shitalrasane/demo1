package array;

import java.util.Arrays;

public class maxele {

	public static void main(String[] args)
	{
		int [] arr=new int[] {25,41,21,12,63,52};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
	      if(arr[i]<min)
			{
				min=arr[i];
			}
			}
			System.out.println(min);
		

	}

}
