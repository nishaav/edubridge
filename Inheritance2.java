package com;

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c1=new C1();
	}

}

//Multi-level
class A1 extends Object
{
	A1(int a)
	{
		
		System.out.println("In class A1");//output
	}
}
class B1 extends A1
{
	B1()
	{
		super(1);
		System.out.println("In class B1");//output
	}
}
class C1 extends B1
{
	C1()
	{
		
		System.out.println("In class C1");//output
	}
}