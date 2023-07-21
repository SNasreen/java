import java.util.*;
class swap 
{
    public static void main(String args[]) 
	{
        int i,j,count=0;
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if (s1.length()==s2.length())
		{
            for(i=0;i<s1.length();i++)
			{
                if(s1.charAt(i)!=s2.charAt(i)) 
				{
					count++;
                }
            }
        }
		if(count==2)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
    }
}