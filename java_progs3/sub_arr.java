import java.util.*;
class sub_arr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int res[]=new int[3];
		int res1[]=new int[3];
		int i,j,count=0,count1=0,count2=0,count3=0,sum=0;
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(i==0 || i==1 || i==2 || i==n-1 || i==n)
			{
				count++;
			}
		}
		for(i=0;i<1;i++)
		{
			count1++;
		}
		for(i=0;i<n-1;i++)
		{
			res[i]=arr[i];
		}count2++;
		for(i=1;i<n-1;i++)
		{
			res1[i]=arr[i];
		}count3++;
		sum=count+count1+count2+count3;
		System.out.println(sum);
		
	}
}

			