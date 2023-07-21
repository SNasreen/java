import java.util.*;
class braces
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		String a={'()'}=3;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
		}
	}
}
