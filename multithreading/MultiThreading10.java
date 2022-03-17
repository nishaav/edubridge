package multithreading;

public class MultiThreading10 {
//Inter-thread communication 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Inter-thread communication is about communication between threads where one thread can communicate with another thread 
		 * 
		 * 
		 * wait() :
		 * notify() :
		 * notifyAll() :
		 * 
		 * 
		 * sleep and wait
		 * sleep()
		 * ->sleep method we are to give a time duration in milliseconds after the duration,threads will resume automatically.
		 * ->resource occupied is not released.
		 * ->it is a static method of Thread class.
		 * ->
		 * 
		 * wait() 
		 * ->method threads will not resume till the time they are not notified.
		 * ->resource occupied is released to be used by other threads.
		 * ->it is a non-static method of Object class.
		 * -> notify() method to resume the thread.
		 * 
		 * 
		 * notify method will notify only the last thread gone into waiting state by using wait method.
		 * 
		 * notifyAll method will notify all the threads gone into waiting state by using wait method.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		Customer customer=new Customer();
		Thread t1=new Thread()
				{
				public void run()
				{
					customer.debit(2000);
				}
				};
				t1.start();
		
		Thread t2=new Thread() {
			public void run()
			{
				customer.credit(20000);
			}
		};
		t2.start();
		
		
		
		
		
	}

}


class Customer
{
	int amt=50000;
	
	synchronized void debit(int amount)
	{
		System.out.println("Withdraw in process!!");
		if(amt<amount)
		{
			System.out.println("Insufficient Balance;wait for the deposit");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				
			}
		}
		amt=amt-amount;
		System.out.println("Withdraw successful!!");
	}
	
	synchronized void credit(int amount)
	{
		System.out.println("Deposit in process");
		amt=amt+amount;
		System.out.println("Deposit successful!!");
		notify();
		
	}
	
}



















