import java.util.*;
class char_rearrange
{
    public static void main(String args[]) 
	{
        int i,j,count=0;
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
		int res=0,count1=0;
		if(s1.charAt(0)=='0')
		{
			System.out.println("It is Not a Duck Number");
		}
        for(i=0;i<s1.length();i++)
		{
            if(s1.charAt(i)=='0') 
			{
				count++;
            }
		}
		if(count<=1)
		{
			System.out.println("It is Duck Number");
		}
    }
}