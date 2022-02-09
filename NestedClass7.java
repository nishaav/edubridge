package nestedClasses;

public class NestedClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1.Demo2 demo=new Impl();// sub to super-->upcasting-->
		demo.show();
//		demo.display();
		
		
		Impl imp=new Impl();
		imp.show();
		imp.display();
	}

}

interface Demo1
{
	interface Demo2
	{
		void show();
	}
}

class Impl implements Demo1.Demo2
{
	@Override
	public void show() {
		System.out.println("providing definition to show method");
	}
	
	void display()
	{
		System.out.println("display method of class Impl");
	}
}
/*
 * ->interface inside another interface must be public.
 * ->
 */

