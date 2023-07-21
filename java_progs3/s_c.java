import java.util.*;
class s_c
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int i,j,sum=0,val;
		String a=sc.nextLine();
		int b=a.length();
		for(i=0;i<b;i++)
		{
			if(a.charAt(i)>'0' && a.charAt(i)<='9')
			{
				val=a.charAt(i)-'0';
				sum=sum+val;
			}
		}
		System.out.println("The value is:" + sum);
	}
}