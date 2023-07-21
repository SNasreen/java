import java.util.*;
class string_aab 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int i,j,count=0;
		int len=str.length();
		String str1=str;
		System.out.println(len);
		for(i=0;i<len;i++)
		{
			count=0;
			for(j=i+1;j<=len;j++)
			{
				if(str1.charAt(i)==str1.charAt(j))
				{
					i='0';
				}
			}
		}
		for(int i<
		System.out.println(str1);
	}
}