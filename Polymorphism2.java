package com;

public class Polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass=new MyClass();
		MyClass myClass1=new MyClass(12,23);
		MyClass myClass2=new MyClass(10);
		MyClass myClass3=new MyClass(89.3);
		MyClass myClass4=new MyClass(67.8f);
	}

}
//constructor overloading
//static polymorphism
class MyClass
{
	//multiple forms of constructor
	//by changing the either parameter type or parameter count
	MyClass()
	{
		System.out.println("Hello User!!");
	}
	MyClass(int a)
	{
		System.out.println("The value of int parameter is "+a);
	}
	MyClass(float a)
	{
		System.out.println("The value of float parameter is "+a);
	}
	MyClass(int a,int b)
	{
		System.out.println((a+b));
	}
	MyClass(double a)
	{
		System.out.println("The value of double parameter is "+a);
	}
	
}


/*
 * 
 * add() 2,3,4,5
 * 
 */



