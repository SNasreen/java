import java.util.*;
class sum
{
public static void main(String args[])
{
	int rem,res=0;
	System.out.println("Enter the number:\n");
	Scanner a=new Scanner(System.in);
	int n=a.nextInt();
	while(n!=0)
	{
		rem=n%2;
		n=n/2;
		res=res+rem;
	}
	System.out.println("Sum of Digits:",res);
}
}