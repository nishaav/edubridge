package multithreading;

public class MultiThreading7 {

	public static void main(String[] args) {
		MT1 mt1=new MT1();
		MT2 mt2=new MT2();
		MT3 mt3=new MT3();
		MT4 mt4=new MT4();
		mt1.setName("One");
		mt2.setName("Two");
		mt3.setName("Three");
		mt4.setName("Four");
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();

	}

}

class Demo
{
	/*
	 * static synchronization is the process by which multiple threads using different instances of the class
	 * will not be able to interfere between the working of each other as the lock is applicable on the class not
	 * on the object.
	 * 
	 * 
	 * synchronized : means multiple threads will not be able to access the resource at one time
	 * 
	 * static : keyword will create only one copy of the resource made static 
	 * 
	 * 
	 * Deadlock : a situation when a thread is waiting for a resource which is occupied by another thread and 
	 * another thread is waiting for a resource which is occupied by first thread.So, both are waiting for each other
	 * to release the resource.
	 * 
	 * 
	 * 
	 */
	synchronized static void show(int n)
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+" : "+n*i);
		}
	}
}

class MT1 extends Thread
{
	public void run()
	{
		Demo.show(2);
	}
}


class MT2 extends Thread
{
	public void run()
	{
		Demo.show(10);
	}
}

class MT3 extends Thread
{
	public void run()
	{
		Demo.show(20);
	}
}

class MT4 extends Thread
{
	public void run()
	{
		Demo.show(5);
	}
}



