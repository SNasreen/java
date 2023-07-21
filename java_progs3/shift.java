//left shift of an array
import java.util.*;
class A
{
	void shi()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp;
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=a;i<=1;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
class shift
{
	public static void main(String args[])
	{
		
		A obj=new A();
		obj.shi();
	}
}