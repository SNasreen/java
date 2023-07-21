import java.util.*;
class data
{
public static void main(String args[])
{
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the string:\n");
	String str=a.nextLine();
	System.out.println("Enter the number:\n");
	int b=a.nextInt();
	System.out.println("Enter the number:\n");
	float c=a.nextFloat();
	System.out.println("The add of numbers is:\n");
	float d=b+c;
	System.out.println(d);
	System.out.println(str);
}
}