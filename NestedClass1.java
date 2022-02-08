package nestedClasses;

import java.lang.System;

public class NestedClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//call display
		A a1=new A();
		a1.display();
		
		A.B b1=a1.new B();//new A().new B();
		b1.show();
		
		A.C c1=a1.new C();
		c1.disp();
		//call()
		
		A.B.D d1=b1.new D();//a1.new B().new D();
		d1.call();
	}

}
//A-->B-->D
//Member inner class
class A
{
	private int a=10;
	class B//member inner class
	{
		class D
		{
			void call()
			{
				System.out.println("Another level increase");
			}
		}
		void show()
		{
			System.out.println("Member Inner class");
			System.out.println(a);
		}
	}
	class C
	{
		void disp()
		{
			System.out.println("Another Inner Class");
		}
	}
	void display()
	{
		System.out.println("Working with Outer Class");
	}
}






/*Nested Classes or Inner Classes
 * ->class declared inside another class or interface.
 * 
 * Types of Nested classes :
 * -> Non-static Nested Classes (Inner classes)
 *  -> 	Member Inner Class : inside the class outside the method. 
 *  ->  Local Inner Class : inside the method.
 *  ->  Anonymous Inner Class : class without a name
 *  
 * -> Static Nested Classes : inside the class outside the method with a static keyword.
 *   
 * 
 * Advantages : 
 * -> Inner class would be able to access the private members of the outer class.
 * -> less code because one can group the required functionalities in a specific location.
 * -> less memory consumption.
 * 
 * 
 * Nested Interface : interface declared inside another interface.
 * 
 * class A
 * {
 * 	private int a;
 *  class B
 *  {
 *  	a
 *  }
 * }
 * 
 * 
 */ 
