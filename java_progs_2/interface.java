interface creation
{
	void shape();
}
class circle implements creation
{
	void shape()
	{
		System.out.println("This is circle");
	}
}
class rect implements creation
{
	void shape()
	{
		System.out.println("This is rectangle");
	}
}
class interface
{
	public static void main(String args[])
	{
		creation of=new circle();
		of.shape();
	}
}