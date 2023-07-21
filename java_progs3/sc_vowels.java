import java.util.*;
class sc_vowels
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int i,count=0,res,e=0;
		int b=a.length();
		for(i=0;i<b;i++)
		{
			res=a.charAt(i);
			switch(res)
			{
				case 'a':
					count++;
					break;
				case 'e':
					count++;
					e++;
					break;
				case 'i':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'u':
					count++;
					break;
			}
		}
		System.out.println(count);
		System.out.println(e);
	}
}