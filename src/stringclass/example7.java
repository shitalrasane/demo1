package stringclass;

public class example7 {

	public static void main(String[] args) 
	{
    char [] c=new char [] {'j','a','v','a','t','p','o','i','n','t'};
    String s1=new String(c);
     System.out.println(s1);
     System.out.println(s1.toUpperCase());
     System.out.println(s1);

 char [] d=s1.toCharArray();
  for(int i=0;i<=s1.length()-1;i++)
  {
	  c[i]=s1.charAt(i);
	  System.out.println(c[i]);

  }
 
	}
}
