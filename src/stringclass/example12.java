package stringclass;

public class example12 {

	public static void main(String[] args) 
	{
		String s1="bvg5nh2nhg5ng6mj8";
		int sum=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
			int a=Character.getNumericValue(s1.charAt(i));
			System.out.println(a);
			sum=sum+a;
			
			}
		}
		System.out.println("-------addition of digit presrent in string-----");
		System.out.println(sum);
				

	}

}
