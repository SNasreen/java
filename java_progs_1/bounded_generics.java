class bound<sample extends sample1>
{
	private sample n;
	public bound(sample obj)
	{
		this.n=obj;
	}
	public void run()
	{
		this.n.display();
	}
}
class sample1 
{
	public void display()
	{
		System.out.println("The first line was executed");
	}
}
class sample2 extends sample1
{
	public void display()
	{
		System.out.println("The second line was executed");
	}
}
class bounded_generics
{
	public static void main(String args[])
	{
		bound<sample1> c=new bound<sample1>(new sample1());
		c.run();
		bound<sample2> b=new bound<sample2>(new sample2());
		b.run();
		
	}
}
		