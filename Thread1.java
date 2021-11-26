class ThreadExample implements Runnable
{
String name;
   ThreadExample(String n)
   {
   name=n;
   System.out.println("creating it:"+name);
   }
    public void run()
    {
    System.out.println("running it: " + name);
   try{
	    for(int i=1; i<=5; i++)
	    {
	    System.out.println("thread:" +name + i);
    
         Thread.sleep(10);
	    }    
    } catch(Exception e)
    {}
 System.out.println("Thread distrubbed!");
    }
    
}

public class Thread1
{
public static void main(String ar[])
{
	
	
	ThreadExample ob=new ThreadExample("zahoor");
	Thread a=new Thread(ob);
	a.start();
	//ThreadExample ob2=new ThreadExample ("ZAhoor Ahmmed");
	// ob2.start();
}
}
	
   