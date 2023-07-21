import java.util.*;
class max_th
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		int n=9;
		int k=a.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=a.nextInt();
		}
			for(int i=1;i<n;i++)
			{
				for(int j=i+1;j<k;j++)
				{
					if(arr[i]<arr[j])
					{
						System.out.println(arr[j]);
					}
				}
				for(int j=i+1;j<k;j++)
				{
					if(arr[i]<arr[j])
					{
						System.out.println(arr[j]);
					}
				}
			}
	}
}