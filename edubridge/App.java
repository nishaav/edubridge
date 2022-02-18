package com.edubridge;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Demo d=new Demo();
        d.setA(6);
        int result=d.getA();
        System.out.println(result);
        d.display();
        d.b=23;
        System.out.println("Protected Member c : "+d.c);
        
    }
}

class Demo
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



	void show()
	{
		a=10;
		System.out.println(a);
	}
	
	
}
//private>default>protected>public
//class cannot be private and protected.
/*private : only within the class it has been declared.
 *
 *
 *
 *
 */


