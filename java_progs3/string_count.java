import java.util.*;
class string_count
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String ch=sc.nextLine();
		int count1=0;
		String[] w=ch.split(" ");
		int len=w.length;
		System.out.println(len);
		for(int i=0;i<len;i++)
		{
			int count=0;
			String r=w[i];
			int len1=r.length();
			for(int j=0;j<len1;j++)
			{
				char n=Character.toLowerCase(r.charAt(j));
				if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u')
				{
					count++;
					count1++;
				}
			}
			System.out.println(count);
		}
		System.out.println(count1);
	}
}