import java.util.*;
class diagonal
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		int m=a.nextInt();
		int n=a.nextInt();
		int arr1[][]=new int[m][n];
		int arr2[][]=new int[m][n];
		int arr3[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr1[i][j]=a.nextInt();
			}
		}
		System.out.println("Element of array1");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println("\n");
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr2[i][j]=a.nextInt();
			}
		}
		System.out.println("Element of array2");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println("\n");
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j||i+j==n-1)
				{
					arr3[i][j]=arr1[i][j]+arr2[i][j];
				
				}
				else
				{
					arr3[i][j]=arr1[i][j];
				}
			}
		}
		System.out.println("Element of array3");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}