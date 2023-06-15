package stringclass;

public class sample6 {

	public static void main(String[] args) 
	{
		String s1="velocity";
		String[] s2=s1.split("");
		for(int i=0;i<s2.length;i++)
		{
		for(int j=i+1;j<s2.length;j++)
		{
			if(s2[i]==s2[j])
			{
				System.out.println(s2[i]);
			}
		}
		}
		

	}

}
