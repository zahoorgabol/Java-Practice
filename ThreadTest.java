class ThreadTest extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
			System.out.println(i);
	}
	public static void main(String sr[])
	{
		ThreadTest t1=new ThreadTest();
		ThreadTest t2=new ThreadTest();
		t1.start();
		t2.start();
	}
}
