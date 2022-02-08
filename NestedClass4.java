package nestedClasses;

public class NestedClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O o1=new O();
		o1.show();
		
		
	}

}
//local class
class O
{
	void show()
	{
		int a=10;
		System.out.println(a);
		
		class I
		{
			void display()
			{
				System.out.println("display method of class I");
			}
		}
		
		I i1=new I();
		i1.display();
		
	}
}
