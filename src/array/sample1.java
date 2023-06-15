package array;

import java.util.Arrays;

public class sample1 {

	public static void main(String[] args) 
	{
String[]arr=new String[5];
arr[0]="shital";
arr[1]="sumit";
arr[2]="svara";
arr[3]="advik";
arr[4]="pankaj";
System.out.println(arr.length);
System.out.println("------------------------");
for(int i=0;i<=arr.length-1;i++)
	{
System.out.println(arr[i]);	
	}
System.out.println("------------------------");
Arrays.sort(arr);
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println(arr[i]);
}
}

}
