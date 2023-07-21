interface print
{
	void p();
}
interface show extends print
{
	void s();
}
class multilevel_inhe implements print
{
	void p()
	{
		System.out.println("HELLO");
	}
	void s()
	{
		System.out.println("WELCOME");
	}
	public static void main(String args[])
	{
		multilevel_inhe obj=new multilevel_inhe();
		obj.p();
		obj.s();
	}
}