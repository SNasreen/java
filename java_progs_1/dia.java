import java.util.Scanner;
class Diamond
{
    public static void main(String args[]) 
    {
        int n,i,j,space=1;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        space=n-1;
        for(j=1;j<=n;j++) 
        {
			if(j%2!=0||j%2==0)
				for(i=1;i<=space;i++) 
				{
					System.out.print(" ");
				}
				space--;
				for(i=1;i<=2*j-1;i++)
					if((i%2==0)||(i%2!=0))
					{
						System.out.print("*");                
					}
			System.out.println("");
        }
        space=1;
        for(j=1;j<=n-1;j++) 
        {
			if(j%2!=0||j%2==0)
				for(i=1;i<=space;i++) 
				{
					System.out.print(" ");
				}
				space++;
				for(i=1;i<=2*(n-j)-1;i++)
					if(i%2==0||i%2!=0)
					{
						System.out.print("*");
					}
            System.out.println("");
        }
    }
}