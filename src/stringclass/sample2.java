package stringclass;

public class sample2 {

	public static void main(String[] args) {
		//String s1="my name is abc";
	String s1="velocity";
           String [] ar=s1.split("o"); //vel[0],city[1]
            System.out.println(ar[0]);
             System.out.println(ar.length);
             
              for(int i=0;i<ar.length;i++)
              {
            	System.out.println(ar[i]);
              }
         
	}

}
