import java.util.*;
class generic
{
	public static void main(String args[])
	{
		Box<Integer> intbox=new Box<Interger>();
		Box<String> strbox=new Box<String>();
		intbox.add(Integer(10));
		strbox.add(String("HEllo world"));
		System.out.println(intbox.get());
		System.out.println(strbox.get());
	}
}     
class Box<T>
{
	private T t;
	public void add(T t)
	{
		this.t=t;
	}
	public T get()
	{
		return t;
	}
}