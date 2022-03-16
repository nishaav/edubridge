package multithreading;

public class MultiThreading9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r1="Resource1";
		String r2="Resource2";
		
		Thread t1=new Thread()
				{
			public void run()
			{
				synchronized(r1)
				{
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						
					}
					System.out.println("Thread 1: having access to resource 1");
					
					synchronized(r2)
					{
						System.out.println("Thread 1: having access to resource 2");
							
					}
				}
			}
				};
				
				Thread t2=new Thread()
				{
			public void run()
			{
				synchronized(r2)
				{
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						
					}
					System.out.println("Thread 2: having access to resource 2");
					
					synchronized(r1)
					{
						System.out.println("Thread 2: having access to resource 1");
							
					}
				}
			}
				};
				t1.start();
//				try
//				{
//					t1.join();
//				}
//				catch(Exception e)
//				{
//					
//				}
				
				//how to avoid deadlock :
				//use join method
				//let threads access the resource in the same sequence.
				//avoid nested locks(means nested synchronized blocks).
				t2.start();
		
	}

}

