import java.util.*;
class ans
{
	public static void main(String args[])
	{
		Scanner b=new Scanner(System.in);
		int a=b.nextInt();
		for(int i=0;i<=a*2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print("#");
			}
			System.out.println("\n");
			for(int k=0;k<=a;k++)
			{
				if(i<4&&i>7)
				{
					System.out.print("$");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
		System.out.println("\n");
	}
}