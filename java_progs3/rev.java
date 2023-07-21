//reverse of an array
import java.util.*;
class ANS
{
	void rev()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The reverse of an array:");
		for(int i=a-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
class rev
{
	public static void main(String args[])
	{
		ANS obj=new ANS();
		obj.rev();
	}
}