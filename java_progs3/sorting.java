import java.util.*;
class sorting
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int[] a=new int [c];
		int b=a.length;
		int i,j,temp,temp1;
		for(i=0;i<c;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<b;i++)
		{
			for(j=i+1;j<b;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int t=sc.nextInt();
		for( i=0;i<b;i++)
		{
			temp1=t;
		}
		System.out.println(temp1);
		
	}
}