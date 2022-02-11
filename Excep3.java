package patternquestions;

public class Excep3 {

	
	public static void main(String args[]) throws ClassNotFoundException,NumberFormatException
	{
		try
		{
			Class.forName("");
			String str="1fdj";
			int i=Integer.parseInt(str);
			System.out.println("Coverting String to int");
		}
		catch(NumberFormatException n)
		{
			System.out.println("multi-catch");
			System.out.println("It will be able to handle any of the three exceptions specified");
			System.out.println("Can specify other excpetions also");
		}
		
		catch(Exception e)
		{
			
		}
		finally
		{
			System.out.println("End Of Program!!");
		}
		//throws and throw
		//throws : used for exception declaration
		//to guide the programmer about the chances of exception which may occur.
		//can be used to declare both types of exceptions : checked and unchecked
		//syntax : use it alongwith method declaration followed by classname
		//can be used to declare multiple exceptions separated by ,
		
		
		
	}
}
