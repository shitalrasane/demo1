package stringclass;

public class dublinstring {

	public static void main(String[] args) 
	{
		String s1="sugtrvcsdd";
		for (int i=0;i<=s1.length()-1;i++)
		{
			for(int j=i+1;j<=s1.length()-1;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					System.out.println(s1.charAt(j));
				}
			}
		}

	}

}
