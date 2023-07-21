import java.util.*;
class sum
{
public static void main(String args[])
{
	int rem,res=0;
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=a.nextInt();
	int t=n/2;
	while(t>0)
	{
		rem=t%10;
		res=res+rem;
		t=t/10;
	}
	System.out.println(res);
	
}
}