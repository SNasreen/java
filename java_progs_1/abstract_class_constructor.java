abstract class abstractclass 
{
	public abstractclass() 
	{
		System.out.println("This is constructor of abstract class");
	}
public abstract void a_method();

public void n_method() 
{
	System.out.println("This is a normal method of abstract class");
}
}

class sub extends abstractclass
{
	public void a_method() 
	{
		System.out.println("This is abstract method");
	}
}
class abstract_class_constructor 
{
	public static void main(String[] args) 
	{
		sub obj = new subclass();
		obj.a_method();
		obj.normalMethod();
	}
}