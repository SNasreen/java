import java.util.*;
class wave
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=3;
		int i,j,count=0;
		int arr[][]=new int[a][a];
		for(i=0;i<a;i++)
		{
			for(j=0;j<a;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<a;i++)
			{
				j=0;
				System.out.print(arr[i][j]+" ");
			}
		for(i=2;i>=0;i--)
		{
			j=1;
			System.out.print(arr[i][j]+" ");
		}
		for(i=0;i<a;i++)
		{
			j=2;
			System.out.print(arr[i][j]+" ");
		}
	}
}