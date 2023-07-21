class thread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
				int a=5;
				int b=10;
				int c=a+b;
				System.out.println(c);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
		public static void main(String args[])
		{
			thread t1=new thread();
			thread t2=new thread();
			t1.start();
		    t2.start();
	}
}