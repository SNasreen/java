import java.util.*;
class disarium
{
	disarium()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String s=Integer.toString(a);
		int len=s.length();
		int res,sum=0,num=a;
		while(num>0)
		{
			res=num%10;
			sum=sum+(int)Math.pow(res,len);
			len--;
			num=num/10;
		}
		if(sum==a)
		{
			System.out.println(sum+" "+"it is disarium");
		}
		else
		{
			System.out.println(sum+" "+"it is not a disarum");
		}
	}
	public static void main(String args[])
	{
		disarium obj=new disarium();
	}
}
			