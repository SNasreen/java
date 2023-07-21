interface Allrounder
{
	void both();
}
class batsman implements Allrounder
{
	public void both()
	{
		System.out.println("I am Batsman");
	}
}
class bowler implements Allrounder
{
	public void both()
	{
		System.out.println("I am Bowler");
	}
}
class all implements Allrounder
{
	public void both()
	{
		System.out.println("I am batsman and bowler");
	}
}
class main
{
	public static void main(String args[])
	{
		Allrounder obj=new batsman();
		Allrounder obj1=new bowler();
		Allrounder obj2=new all();
		obj.both();
		obj1.both();
		obj2.both();
	}
}