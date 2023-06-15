package stringclass;

public class example5 {

	public static void main(String[] args) 
	{
String s1="velocity corporate tranning center";
String s2=" pune";
System.out.println(s1.length());
System.out.println(s1.toUpperCase());
System.out.println(s1.isEmpty());
String [] aar=s1.split(" ");
System.out.println(aar.length);
for(int i=0;i<aar.length;i++)
{
	System.out.println(aar[i]);
	}
System.out.println(s1.concat(s2));
System.out.println(s1.contains("center"));
System.out.println(s1.startsWith("my"));
System.out.println(s1.endsWith("center"));
System.out.println(s1.substring(1,4));
System.out.println(s1.indexOf('n'));
System.out.println(s1.length());
System.out.println(s1.lastIndexOf('n'));
	}

}
