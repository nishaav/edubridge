package multithreading;

public class MultiThreading1 {
/*
 * New------------------------>Runnable---------------------------->Terminated
 * State				(executing the task allocated)			(when working is complete)	
 * (ready to execute)
 * Worker Threads
 * ->starting JVM
 * ->running the program
 * ->activating garbage collector
 * User defined 
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getState());
		System.out.println(t1.getPriority());
		System.out.println(t1.isAlive());
		System.out.println(t1.getThreadGroup());//students in batch=threads in group
		System.out.println(t1.activeCount());
		System.out.println(t1.isDaemon());
		System.out.println(t1.MAX_PRIORITY);
		System.out.println(t1.MIN_PRIORITY);
		System.out.println(t1.NORM_PRIORITY);
		//queue of 10 threads 1-10
		MyThread t2=new MyThread();
		System.out.println(t2.getState());
		System.out.println(t2.isAlive());
		t2.start();
		try
		{
			t2.join();
		}
		catch(Exception e)
		{
			
		}
		System.out.println(t2.getState());
		System.out.println(t2.isAlive());
		
		
	}

}
class MyThread extends Thread
{
	public void run()
	{
		Thread t2=Thread.currentThread();
		System.out.println("Started My Thread : "+t2.getState());
		System.out.println(t2.isAlive());
	}
}


