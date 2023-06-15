/**
 * 
 */
package Program;

/**
 * @author Shital
 *
 */
public class maximunof5 
{ 
	public static void main(String[]args)
	{
		int a=30;
		int b=50;
		int c=10;
		int d=5;
		int e=20;
		if(a>b) 
		{
			if(a>c)
			{
				if(a>d)
				{
					if(a>e)
					{
						System.out.println(a);
					}
					else
					{
						System.out.println(e);
					}
				}
				else
				{
					if(b>c)
			
					{
						if(b>d)
						{
							if(b>e)
							{
								System.out.println(b);
							}
							else
							{
							System.out.println(e);	
							}
							}
						else
							{
							if(c>d)
							{
								if(c>e)
								{
									System.out.println(c);
								}else
								{
									System.out.println(e);
								}
							}
							else
							{
								if(d>e)
								{
									System.out.println(d);
								}
								else
								{
									System.out.println(e);
								}
							}
							}
					}
					
				}
			}
			
		}
	}
}