package multithreading;

public class MultiThreading5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Synchronized method example
		
		//synchronized keyword with the resource.
		//class 
		// object
		//method
		
		
		//Synchronization : capability to control the multiple threads accessing the shared resource.
		/*
		 * why?
		 * 1)to prevent thread interference.
		 * 
		 * locking the resource.
		 * object monitor lock
		 * 
		 * whenever multiple threads are accessing a shared resource
		 * 
		 * S1
		 * S2------------------>PRINTER
		 * S3
		 * S4
		 * 
		 * 
		 * 
		 * Thread Synchronization :
		 * 1) mutual exclusive
		 * ->Synchronized method
		 * ->synchronized block
		 * ->static synchronization
		 * 
		 * 2) inter-thread communication
		 * 
		 */
		
		DemoSample sample=new DemoSample();
		My1 my1=new My1(sample);
		My2 my2=new My2(sample);
		my1.start();
		my2.start();
		
		
	}

}
//resource
class Sample
{
	synchronized void show(int num)
	{	
		
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			System.out.println(Thread.currentThread().getName()+" : "+(num*i));
		}
		for(int j=1;j<=10;j++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			
			}
			System.out.println(Thread.currentThread().getName()+" j : "+(j));
		}
	}
}

class My1 extends Thread
{
	DemoSample sample;
	
	My1(DemoSample sample)
	{
		this.sample=sample;
	}
	
	public void run()
	{
		sample.show(2);
	}
}

class My2 extends Thread
{
	DemoSample sample;
	
	My2(DemoSample sample)
	{
		this.sample=sample;
	}
	
	public void run()
	{
		sample.show(20);
	}
}

/*
 * Project Allocation
 * 1)project to be based on core java concepts.
 * 
 * Core Java :
 * 
 * MLAT scheduled : 
 * Assessment : 20% weightage
 * 
 * Mock Interview : 
 * 
 * SQL : 1-2 weeks
 * MySQL
 * ->JDBC: java database connectivity
 * 
 * File Handling :
 * Project based on core java : 
 * 1 week : 
 * 
 * 
 * 
 */
