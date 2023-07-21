import java.util.*;
class char_rearrange
{
    public static void main(String args[]) 
	{
        int i,j,count=0;
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
		int len=s1.length();
		int res=0,count1=0;
		for(int i=0;i<len;i++)
		{
			if((s1.charAt(i)!=s1.charAt(i+1)) && (s1.charAt(i)!=s1.charAt(i-1)) && s1.charAt(
    }
}