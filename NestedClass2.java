package nestedClasses;

public class NestedClass2 {

	public static void main(String args[])
	{
		Outer outer=new Outer();
		Outer.Inner inner=outer.new Inner();
		inner.show();
		Outer.Inner.SubInner sb=inner.new SubInner();
		sb.disp();
	}
	
}

class Outer
{
	class Inner
	{
		class SubInner
		{
			void disp()
			{
				System.out.println("disp of sub inner");
			}
		}
		
		void show()
		{
			System.out.println("Calling inner class method");
		}
	}
}
