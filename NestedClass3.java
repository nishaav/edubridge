package nestedClasses;

public class NestedClass3 {

	
	static int a=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//call show of I1
		O1.I1 ref=new O1.I1();
		ref.disp();
		
		O1.I1.show();
	}

}
//local class
     
class O1
{
	static class I1
	{
		static void show()
		{
			System.out.println("definition of show method");
		}
		void disp()
		{
			System.out.println("Non-static method");
		}
	}
}

