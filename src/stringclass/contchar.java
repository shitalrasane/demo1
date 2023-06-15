package stringclass;

public class contchar {

	public static void main(String[] args) 
	{
		String s1="velocity corporate tranning center";
		int count=0;
		for( int i=0;i<s1.length();i++)
		{ 
		 
			if(s1.charAt(i)!='_')
			{
				count++;
			}
		}
			System.out.println("Total no of charcter in string " + count);
		

	}

}
