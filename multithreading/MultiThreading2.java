package multithreading;
import java.util.*;
public class MultiThreading2 {

	public static void main(String[] args) {
		MyThread1 mythread=new MyThread1();
		mythread.start();
	}

}
class MyThread1 extends Thread
{
	public void run()
	{
		Scanner scanner=new Scanner(System.in);
		String ar[]=new String[5];
		System.out.println("Allocate 5 Names : ");
		for(int i=0;i<5;i++)
		{
			ar[i]=scanner.nextLine();
		}
		Thread t1=Thread.currentThread();
		for(int i=0;i<5;i++)
		{
			t1.setName(ar[i]);
			System.out.println(t1.getName()+" : "+(i+1));
		}
		scanner.close();
	}
}

/*
 * 1)Extending the Thread class
 * 2)Implementing Runnable interface
 * ->Functional interface(interface with only 1 method declared)
 * ->run()
 *
 *
 *Runnable interface is implemented by the Thread class.
 *
 *
 *
 *
 *
 */


