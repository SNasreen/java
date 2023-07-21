import java.util.*;
class factorial
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int rem,res=1;
		int a=obj.nextInt();
		for(int i=1; i<=a; i++)
		{
			res=res*i;
		}
		System.out.printf("The Factorial number %d is: ",a,res);
	}
}
			
		