package multithreading;

public class MultiThreading8 {

	public static void main(String[] args) {
		
		Demo1 demo=new Demo1();
		
		Demo1 demo2=new Demo1();
		MT11 mt1=new MT11(demo);
		MT12 mt2=new MT12(demo);
		MT13 mt3=new MT13(demo2);
		MT14 mt4=new MT14(demo2);
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

class Demo1
{
	synchronized void show(int n)
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

class MT11 extends Thread
{
	Demo1 demo;
	
	MT11(Demo1 demo)
	{
		this.demo=demo;
	}
	
	public void run()
	{
		demo.show(2);
	}
}


class MT12 extends Thread
{
	Demo1 demo;
	
	MT12(Demo1 demo)
	{
		this.demo=demo;
	}
	
	public void run()
	{
		demo.show(12);
	}
}

class MT13 extends Thread
{
	Demo1 demo;
	
	MT13(Demo1 demo)
	{
		this.demo=demo;
	}
	
	public void run()
	{
		demo.show(10);
	}
}

class MT14 extends Thread
{
	Demo1 demo;
	
	MT14(Demo1 demo)
	{
		this.demo=demo;
	}
	
	public void run()
	{
		demo.show(5);
	}
}



