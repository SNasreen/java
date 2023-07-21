import java.util.*;
class duplicatestring
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0,i,j;
		String w[]=str.split(" ");
		for(i=0;i<w.length;i++)
		{
			count=1;
			for(j=i+1;j<w.length;j++)
			{
				if(w[i]==w[j])
				{
					count++;
					w[j]="0";
				}
			}
		}
		if(count>1 && w[i] != "0")
		{
			System.out.println(w[i]);
		}
	}
}