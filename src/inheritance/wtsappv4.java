package inheritance;

public class wtsappv4 extends wtsappv3 //subclass
{
public void status()
{
	System.out.println("Status");
}
public static void main(String[]args) 
{
wtsappv4 v4=new wtsappv4();
v4.videocall();
v4.audiocall();
v4.sms();
v4.status();
}
}
