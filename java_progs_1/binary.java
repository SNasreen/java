import java.util.*;
 
 class binary
 {
    public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int size = a.length();
        int res=0,cnt=0;
		int i,j;
        int space=' ';
        for (i=0;i<size;i++) 
		{
            char position=a.charAt(i);
            if (position==space) 
			{
                res++;
                if(res>cnt) 
				{
                    cnt=res;
                }
            }
			else
			{
                res=1;
            }
            space=position;
        }
        if (cnt >= 6) 
		{
            System.out.println("Sorry , sorry!");
        }
		else
		{
			System.out.println("Good Luck...!");
		}
    }
}