import java.util.*;
class median
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp;
		int res=0;
		float rem=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		res=n/2;
		rem=(n*(n+1))/2;
		if(n%2!=0)
		{
			System.out.println(arr[res]);
		}
		else if(n%2==0)
		{
			System.out.println(rem);
		}
	}
}
		