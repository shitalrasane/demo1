package Program;

import java.util.Scanner;

public class swichpro 
{ 
	public static void main(String[] args)
	{
		int a ,b ,c,ch;
		System.out.println("enter any two number");
		Scanner s =new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("enter any choice");
		ch=s.nextInt();
		
		switch(ch)
		{
		case 1:c=a+b;
		System.out.println("Addition is" +c);
		break;
		case 2:c=a-b;
		System.out.println("subtarction is" +c);
		break;
		case 3:c=a*b;
		System.out.println("multiplication is" +c);
		break;
		case 4:c=a/b;
		System.out.println("division  is" +c);
		break;
		case 5:c=a%b;
		System.out.println("reminder is" +c);
		break;
        default:
        System.out.println("enter valid case");
        
		}
				
		
	}

}
