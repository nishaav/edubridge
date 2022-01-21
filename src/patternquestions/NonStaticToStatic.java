package patternquestions;

public class NonStaticToStatic {

	
	static int a=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticToStatic ns=new NonStaticToStatic();
		ns.show();
		
		Screen screen=new Screen();
		int num=screen.add(12, 23);
		System.out.println(num);
	}

	void show()
	{
		System.out.println(a);
		System.out.println("Calling show");
		System.out.println(Screen.b);
	}
}

class Screen
{
	static int b=10;
	int add(int a,int b)
	{
		return a+b;
	}
}



