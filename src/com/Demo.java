package com;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(Dummy.a);
			Dummy.display();
			Dummy dummy=new Dummy();
			dummy.show();
			System.out.println(dummy.b);
	}
	
	void call()
	{
		System.out.println(Dummy.a);
		Dummy.display();
		
		Dummy dummy=new Dummy();
		dummy.show();
	}
	

}
 
class Dummy
{
	static int a=10;
	int b=20;
	
	static void display()
	{
		System.out.println(a);
		Dummy dummy=new Dummy();
		System.out.println(dummy.b);
	}
	void show()
	{
		System.out.println(a);
		System.out.println(b);
	}
}