import java.util.*;
class submarine
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=0,count=0,count1=0,rem=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int pos=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]<pos)
			{
				res=pos-arr[i];
				count=res+count;
			}
			else
			{
				rem=arr[i]-pos;
				count1=rem+count1;
			}
		}
		int result=count+count1;
		System.out.println(result);
	}
}