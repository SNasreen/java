import java.util.*;
class lucky
{
	public static void main(String args[])
	{
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		int rem,res=0,i;
		for(i=1;i<=3;i++)
		{
			res=res+a;
			a--;
		}
		System.out.println(+res);
	}
}