import java.util.*;
class string_repeat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		while(a--)
		{
			String s=sc.nextLine();
			int n=s.length();
			String b;
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count++;
					}
					else
					{
						b=s.charAt(i);
						break;
					}
				}
			}
			if(count>1)
			{
				System.out.println(b);
			}
		}
	}
}