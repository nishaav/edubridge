package patternquestions;
import java.util.Scanner;
public class Excp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int result;
		
		try
		{
			result=num1/num2;
			System.out.println(result);
		}
		catch(Exception e)//generalized catch block
		{
			System.out.println("Exception encountered!!");
		}

	}

}
