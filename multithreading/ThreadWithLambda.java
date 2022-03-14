package multithreading;

public class ThreadWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A ref=()->
		{
			System.out.println("Hello World!!");
		};
		
		ref.show();
		//Lambda implementation in run() of thread
		Runnable r=()->{
			for(int i=1;i<=10;i++)
			{
				
				Thread t1=Thread.currentThread();//provides the reference of currently executing thread
				System.out.println(t1.getName()+" : "+i);
			}
			
		};
		Thread t1=new Thread(r);
		t1.start();
		//anonymous class
		 Thread t2=new Thread() {
			public void run()
			{
				for(int i=1;i<=10;i++)
				{
					
					Thread t1=Thread.currentThread();//provides the reference of currently executing thread
					System.out.println(t1.getName()+" : "+i);
				}
			}
		 };
		t2.start();
		//anonymous interface
		Runnable r2=new Runnable() {
			public void run()
			{
				for(int i=1;i<=10;i++)
				{
					
					Thread t1=Thread.currentThread();//provides the reference of currently executing thread
					System.out.println(t1.getName()+" : "+i);
				}
			}
		 };
		 Thread t3=new Thread(r2);
		 t3.start();
		 
		 Runnable r3=new Thread() {
				public void run()
				{
					for(int i=1;i<=10;i++)
					{
						
						Thread t1=Thread.currentThread();//provides the reference of currently executing thread
						System.out.println(t1.getName()+" : "+i);
					}
				}
			 };
			 Thread t4=new Thread(r3);
			 t4.start();
		
		
	}

}
interface A
{
	void show();
}