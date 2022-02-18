package com.edubridge;
public class Demo1
{
	private int a;
	int b;
	protected int c=10;
	public int d;
	float f1;
	String str;
	char ch;
	long l;
	double d1;
	
	void display()
	{
		System.out.println("Int : "+b);
		System.out.println("long : "+l);
		System.out.println("float : "+f1);
		System.out.println("double : "+d1);
		System.out.println("char : '"+ch+"'");
		System.out.println("String : "+str);
		System.out.println("Protected Member c : "+c);
	}
	
	
	public int getA() {
		return a;
	}

	
	public void setA(int a) {
		this.a = a;
	}



	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}


	void show()
	{
		a=10;
		System.out.println(a);
	}
	
	
}
