import java.util.*;
class sum_mod_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		int sum=0,res=0,k=0,temp,i;
		int a1[]=new int[2];
		for(i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<a;i++)
		{
			if(arr[i]%3==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
		if(sum>99)
		{
			while(k<2)
			{
				temp=sum%10;
				a1[k]=temp;
				k++;
				sum=sum/10;
			}
			for(i=1;i>=0;i--)
			{
				System.out.print(a1[i]);
			}
		}
		else if(sum<=99)
		{
			res=sum%10;
			System.out.println(res);
		}
	}
}