import java.util.*;
class sum
{
public static void main(String args[])
{
	int rem,res=1;
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=a.nextInt();
	while(n>0)
	{
		rem=n%10;
		res=res*rem;
		n=n/10;
	}
	System.out.println("Sum of Digits: "+res);
	
}
}