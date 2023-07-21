import java.util.*;
class vowels
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int i,j,count=0,sum=0,val;
		String a=sc.nextLine();
		char [] c=a.toCharArray();
		for(i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				count++;
			}
			if(c[i]=='e')
			{
				sum++;
			}
		}
		System.out.println("The value is:" + count);
		System.out.println("The value is:" + sum);
	}
}