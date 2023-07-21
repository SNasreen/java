import java.util.*;
class equ
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int len=a.length();
		int temp;
		for(int i=0;i<len;i++)
		{
			for(int j=len;j>0;j++)
			{
				if(a.charAt(i)=='a' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
				{	
					temp=i;
					i=j;
					j=temp;
				}
			System.out.println(j);
			}
		}
	}
}
		
				
				