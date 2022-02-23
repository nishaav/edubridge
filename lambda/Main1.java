package com.dummy;

public class Main1 {

	public static void main(String[] args) 
	{
		C o=new C();
		o.show();
		
		//anonymous class
		I i=new I()
				{
					public void show()
					{
						System.out.println("Hello User!!");
					}
					
					public void disp()
					{
						System.out.println("Hello User!!");
					}
				};
				i.show();
				
				
		//Lambda Expression
				//(argumentlist)->{}
				//->arrow-operator || arrow token
				//{}->body of the method
			I i1=()->{
				System.out.println("Hello User");
			};
			
			i1.show();
		
	}

}
interface I//functional interface
{
	void show();
}
class C implements I
{
	public void show()
	{
		System.out.println("Hello World!!");
	}
	
	public void display()
	{
		System.out.println("Hello World!!");
	}
}


// Lambda Expression :
//a new concept added in Java 8 that facilitates to write 
//long statements as an expression in the language
//Lambda expression are very useful in collections.
//fetch , iterate over collection.

//Lambda expression are especially used to provide implementation to
//the interfaces which are functional interfaces.
//
//functional interface that has only one method.
//Lambda expressions are treated as a function/method, so no speerate .class 
//file is created.

//Benefit :
//less code