package stringclass;

public class example4 {

	public static void main(String[] args) {
		String s1="my name is abc";
		String s2="";
		String s3="MY NAME IS ABC";
		String s4="shital";
		System.out.println(s1.endsWith("abc"));
		System.out.println(s1.startsWith("MY"));
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s1.equals(s3));
		System.out.println(s1.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s2.concat(s4));
		System.out.println(s1.contains("my"));
		System.out.println(s4.substring(1,3));
		System.out.println(s1.replace("abc","shital"));
		

	}

}
