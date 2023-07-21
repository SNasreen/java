import java.util.*;
class fact
{
	public static void main(String args[])
	{
		System.out.println("Enter the number:");
		int rem;n
		long res=1;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a>0)
		{
			rem=a%10;
			res=res*rem;
			a=a/10;
		}
		System.out.println("The factorial of number is:"+res);
	}
}
		