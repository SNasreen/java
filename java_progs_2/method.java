import java.util.*;
class meth
{
	int a,b,c,d;
	void fun()
	{
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
	}
	void add()
	{
		int res=a+c;
		int res1=b+d;
		System.out.println(res+"+"+res1+"i");
	}
	void sub()
	{
		int subt=a-c;
		int subt1=b-d;
		System.out.println(subt+"+"+subt1+"i");
	}
	void multi()
	{
		int rem=(a*c)-(b*d);
		System.out.println(rem+"+"+rem+"i");
	}
}
class method
{
	public static void main(String args[])
	{
		meth obj=new meth();
		obj.fun();
		obj.add();
		obj.sub();
		obj.multi();
	}
}

