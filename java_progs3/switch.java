import java.util.*;
class switchcase
{
	public static void main(String args[])
	{
		
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int age=a.nextInt();
		switch(n)
		{
			case 1:
			if(age>18)
			{
				System.out.println("Major");
			}
			break;
			case 2:
			if(age<18)
			{
				System.out.println("Minor");
			}
			default:
			System.out.println("adult");
		}
	}
}
		