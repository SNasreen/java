import java.util.*;
class mod
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0)
		{
			if(n%10==0)
			{
				System.out.println("it is  duck");
			}
			n=n/10;
		}	
	}
}