class one
{
	void first()
	{
		System.out.println("Hello");
	}
}
class constr
{
	int a,b;
	constr(int c,int d)
	{
		int a=c;
		int b=d;
		int n=c+d;
		System.out.println(n);
	}
}
class s_inherit
{
	void second()
	{
		System.out.println("This is example of Inheritance 1");
	}
}
class inherit1 extends s_inherit
{
	void third()
	{
		System.out.println("single_inheritance");
	}
}
class m_inherit
{
	void four()
	{
		System.out.println("This is example of Inheritance 1");
	}
}
class inherit2 extends m_inherit
{
	void five()
	{
		System.out.println("multilevel_inheritance 1");
	}
}
class inherit3 extends inherit2
{
	void six()
	{
		System.out.println("multilevel_inheritance 2");
	}
}
class h_inherit
{
	void seven()
	{
		System.out.println("This is example of Inheritance 1");
	}
}
class inherit4 extends h_inherit
{
	void eight()
	{
		System.out.println("multilevel_inheritance 1");
	}
}
class inherit5 extends h_inherit
{
	void nine()
	{
		System.out.println("multilevel_inheritance 2");
	}
}
abstract class inh
{
	abstract void met_1();
}
class abs extends inh
{
	void met_1()
	{
		System.out.println("Abstract Inheritance");
	}
}
class over_loading
{
	void met_3(int a,int b)
	{
		System.out.println("Over Loading");
		int c=a+b;
		System.out.println(c);
	}
	void met_3(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
}
class over_riding
{
	void fun()
	{
		System.out.println("Over Riding");
	}
}
class sub extends over_riding
{
	void fun()
	{
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println(c);
	}
}
package mypack
{
	class a
	{
		void func()
		{
			System.out.println("Package Example");
		}
	}
}
class all
{
	public static void main(String args[])
	{
		one ob=new one();
		ob.first();
		constr o=new constr(5,3);
		inherit1 ob1=new inherit1();
		ob1.second();
		ob1.third();
		inherit3 ob2=new inherit3();
		ob2.four();
		ob2.five();
		ob2.six();
		inherit4 ob3=new inherit4();
		ob3.eight();
		ob3.seven();
		inherit5 ob4=new inherit5();
		ob4.nine();
		abs ob5=new abs();
		ob5.met_1();
		over_loading ob6=new over_loading();
		ob6.met_3(5,3);
		ob6.met_3(1,5,2);
		over_riding ob7=new over_riding();
		over_riding ob8=new sub();
		ob7.fun();
		ob8.fun();
	}
}

















































