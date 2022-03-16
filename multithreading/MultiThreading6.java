package multithreading;

public class MultiThreading6 {
//Synchronized block
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoSample sample=new DemoSample();
		My1 my1=new My1(sample);
		My2 my2=new My2(sample);
		my1.start();
		my2.start();
		
		
		
		/*
		 * t1---- 
		 * t2----R1(sync)
		 * 
		 * t3---
		 * t4---R2(sync)
		 * 
		 * 
		 * t1.start();
		 * t2.start();
		 * t3.start();
		 * t4.start();
		 * 
		 */
		
		
		
	}

}
class Sample1
{
	void show(int num)
	{	
		synchronized(this)
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
		}
		
	}
}

class My11 extends Thread
{
	Sample1 sample;
	
	My11(Sample1 sample)
	{
		this.sample=sample;
	}
	
	public void run()
	{
		sample.show(2);
	}
}

class My12 extends Thread
{
	Sample1 sample;
	
	My12(Sample1 sample)
	{
		this.sample=sample;
	}
	
	public void run()
	{
		sample.show(20);
	}
}