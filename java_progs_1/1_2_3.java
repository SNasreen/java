import java.util.*;
class eleven
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0,count=1;
		for(int i=0;i<a;i++)
		{
			sum=sum+count;
			j=(j*10)+1;
		}
		System.out.println(sum);
	}
}