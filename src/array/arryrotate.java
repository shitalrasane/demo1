package array;

public class arryrotate {

	public static void main(String[] args) {
int [] arr=new int[] {1,2,8,9,6};
int [] arr1=new int [arr.length];
 int n=4;
int first=0;
for(int i=0;i<=arr.length;i++)
{
System.out.println(arr[i]);	
}
for(int i=0;i<n;i++)
{ int j;
first=arr[0];
for(j=i+1;j<=arr.length;j++)
{
arr1[j]=arr[j+1];
}
  arr[j]=first;
for(int k=0;k<=arr1.length;k++)
{
	System.out.println(arr[k]);
}
}	
	}
	}
	
