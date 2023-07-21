import java.util.*;
class twoarr
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in)
		int m=a.nextInt();
		int n=a.nextInt();
		int arr[][]=new int [n][m];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[][]=a.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("The elements are:"+arr[i][j];
			}
		}
		
