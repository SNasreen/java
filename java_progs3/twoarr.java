import java.util.*;
class twoarr
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		int m=a.nextInt();
		int n=a.nextInt();
		int arr[][]=new int [m][n];
		System.out.println("Enter the elements:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=a.nextInt();
			}
		}
		System.out.println("The elements are:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println("\n");
		}
	}
}
		
