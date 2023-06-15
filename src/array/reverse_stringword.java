package array;

public class reverse_stringword {

	public static void main(String[] args) {
		String s="welcome to velocity training center";
	String []s2=s.split(" ");
	String rev="";
		for(int i=0;i<s2.length;i++)
		{
	
			String s1=s2[i].toString();
			for(int j=0;j<=s1.length()-1;j++)
			{
			
				
				rev=s1.charAt(j)+rev;
				
				//System.out.println(rev);
			}
		}
		
		System.out.println(rev);
		
		//System.out.println();
	}

}
