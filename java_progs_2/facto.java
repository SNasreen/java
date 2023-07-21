import java.util.Scanner;
public class divisor
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		try
		{
		for(i=0;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.printf("%d ",i);
			}
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}