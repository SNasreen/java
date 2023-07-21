class myexception extends work
{
	myexception(string s)
	{
		super(s);
	}
}
class work
{
	public static void main(String args[])
	{
		if(args[0]== "Hello") 
		{
			System.out.println("String is right");
		}
		else
		{
			try
			{
				throw new myexception("Invalid string");
			}
			catch(myexception ex)
			{
				System.out.println(ex.gemessage());
			}
		}
	}
}