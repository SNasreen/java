import java.util.*;
abstract class shape
{
	abstract void area();	
}
class rectangle extends shape
{
	void area()
	{
		System.out.println("Area of rectangle");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int area1=a*b;
		System.out.println("Area of rectangle");
		System.out.println(area1);
	}
}
class triangle extends shape
{
	void area()
	{
		System.out.println("Area of triangle");
		Scanner sc1=new Scanner(System.in);
		int l=sc1.nextInt();
		int b=sc1.nextInt();
		int h=sc1.nextInt();
		int area2=l*b*h;
		System.out.println("Area of triangle");
		System.out.println(area2);
	}
}
class circle extends shape
{
	void area()
	{
		System.out.println("Area of circle");
		Scanner sc2=new Scanner(System.in);
		int m=sc2.nextInt();
		int area3=m*m;
		System.out.println("Area of circle");
		System.out.println(area3);
	}
}
class abs
{
	public static void main(String args[])
	{
		shape obj=new rectangle();
		obj.area();
		shape obj1=new triangle();
		obj1.area();
		shape obj2=new circle();
		obj2.area();
	}
}