import java.util.*;
class val
{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		int a=5;
		int arr[]=new int[a];
		int arr1[]=new int[a];
		int arr2[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			if(i!=a/2)
			{
				arr2[i]=arr[i]+arr1[i+1];
				i++;
				arr2[i]=arr[i]+arr1[i-1];
			}
			else if(i==a/2)
			{
				arr2[i]=arr[i]+arr1[i];
			}
		}
		for(int i=0;i<a;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.print("\n");
		for(int i=0;i<a;i++)
		{
			if(arr2[i]<10)
			{
				System.out.print("S"+" ");
			}
			else
			{
				System.out.print("D"+" ");
			}
		}
	}
}
		
		
		