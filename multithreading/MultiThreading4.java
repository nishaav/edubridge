package multithreading;

public class MultiThreading4 {
//sleeping a thread
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 myThread1=new MyThread3();
		//MyThread3 myThread2=new MyThread3();
		myThread1.setName("Supriya");
		MyThread4 myThread4=new MyThread4();
		myThread4.setName("Tanvi");
		//myThread2.setName("Tanvi");
		//join method 
		//join() method waits for the thread to die
		myThread1.start();
		try
		{
			myThread1.join();
		}
		catch(InterruptedException e)
		{
			
		}
		
		//myThread2.start();
		myThread4.start();
		
	}

}
class MyThread3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			Thread t1=Thread.currentThread();//provides the reference of currently executing thread
			System.out.println(t1.getName()+" : "+i);
			//halt state-->waiting state
			/*
			 * sleep(long millis)
			 * ->static method of Thread class
			 * ->used to halt(waiting/pause) the current execution of Thread.
			 * ->it throws InterruptedException, that is why need to be carried inside try block.
			 * ->After the sleep duration,thread will resume automatically and continue with the remain task.
			 * 
			 * 
			 */
			/*
			 * When current thread is in sleep mode, system will not keep ideal, rather it will execute the next 
			 * thread of the queue. 
			 * 
			 * T1    
			 * run()
			 * {
			 * Thread.sleep(2000);
			 * }
			 * 
			 * T2
			 * run()
			 * {
			 * 	No sleep implementation
			 * }
			 * 
			 * 
			 * 
			 */
		}
	}
}

class MyThread4 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			
			Thread t1=Thread.currentThread();//provides the reference of currently executing thread
			System.out.println(t1.getName()+" : "+i);
		}
	}
}

