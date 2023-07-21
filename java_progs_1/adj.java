import java.util.*;
class adj
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int m=obj.nextInt();
		int arr[][]=new int[m][m];
		int temp;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=obj.nextInt();
			}
		}
		System.out.println("The Element of an array is:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("The Adjacent of an array is:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==j+1&& j==i-1)
				{
					arr[i][j]=(arr[i][j])-(2*arr[i][j]);
					break;
				}
				else if(i==j)
				{
					temp=arr[i][j];
					arr[i][j]=arr[i+1][j+1];
					arr[i+1][j+1]=temp;
				}
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}	