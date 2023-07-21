import java.util.*;
class incrementing_pat
{
	public static void main(String args[])
	{
		Scanner o=new Scanner(System.in);
		String st=o.nextLine();
		int b=st.length();
		for(int i=0;i<b;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(st.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}