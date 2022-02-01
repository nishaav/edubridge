package stringHandling;

public class StringSample1 
{
	public static void main(String args[])
	{
		Demo demo=Demo.getObj();
		demo.show();
		demo.display();
		
		Demo demo1=Demo.getObj();
		demo1.show();
		demo1.display();
		
		Demo1.sh();
	}
}
//Singleton design pattern
class Demo
{
	private static Demo demo=new Demo();
	
	Demo()
	{
		System.out.println("Constructor");
	}
	
	public static Demo getObj()
	{
		return demo;
	}
	public void show()
	{
		System.out.println("Hello");
	}
	public void display()
	{
		System.out.println("Display");
	}
}

class Demo1
{
	static void sh()
	{
		Demo demo=Demo.getObj();
		demo.show();
		demo.display();
		
		Demo demo1=Demo.getObj();
		demo1.show();
		demo1.display();
	}
}
/*
 *  class object method
 *  method calling
 *  variables
 *  datatypes
 *  decision making constructs
 *  loops
 *  arrays
 *  inheritance
 *  exception handling
 *  abstraction
 *  encapsulation
 *  abstract classes and interfaces
 *  polymorphism
 *  packages
 *  collections with generics 
 *  
 *   
 *  
 * 
 * 
 *
 */


