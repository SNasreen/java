import java.util.*;
class summation
{
	summation(int a)
	{
		int sum=0,count=1;
		for(int i=0;i<a;i++)
		{
			sum=sum+count;
			count=(count*10)+1;
		}
		System.out.println(sum);
	}	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		summation obj=new summation(a);
		
	}
}