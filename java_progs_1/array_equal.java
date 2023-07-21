import java.util.*;
class array_equal
	{
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] arr=new int[a];
		int[] arr1=new int[a];
		int i,j,count=0;
		for(i=0; i<a; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0; i<a; i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(i=0; i<a; i++)
		{
			for(j=0; j<a; j++)
			{
				if(arr[i]==arr1[j])
				{
					count++;
				}
			}
		}
		if(count==a)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}