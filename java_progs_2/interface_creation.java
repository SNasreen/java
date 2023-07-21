interface creation
{
	void shape();
}
class circle implements creation
{
	public void shape()
	{
		System.out.println("This is circle");
	}
}
class rect implements creation
{
	public void shape()
	{
		System.out.println("This is rectangle");
	}
}
interface show
{
	void printable();
}
interface print
{
	void showable();
}
class interface_creation implements show,print
{
	void printable()
	{
		System.out.println("HELLO");
	}
	void showable()
	{
		System.out.println("HELLO");
	}
	public static void main(String args[])
	{
		creation of=new circle();
		interface_creation of2=new interface_creation();
		of2.printable();
		of2.showable();
		of.shape();
	}
}