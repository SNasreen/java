import java.util.*;
class repeated
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
	    int n = sc.nextInt ();
        int arr[] = new int[n];
		int count=0;
        for (i = 0; i < n; i++)
		{
            arr[i]=sc.nextInt();
		}
		for(i = 0; i < n; i++)
		{  
			for(j = i + 1; j < n; j++) 
			{  
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
        }
		System.out.println(count);
		for(i = 0; i < n; i++)
		{  
			for(j = i + 1; j < n/2+1; j++) 
			{  
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
        }
    }  
}