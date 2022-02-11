package patternquestions;

import java.util.Scanner;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		try
		{
			
			System.out.println("Enter your age : ");
			int age=scanner.nextInt();
			Vote vote=new Vote();
			vote.check(age);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			scanner.close();
		}

	}

}

class Vote
{
	void check(int age)
	{
		if(age>=18)
		{
			System.out.println("Eligible for voting!!");
		}
		else
		{
			throw new ArithmeticException("Not eligible as age is below 18 years");
		}
	}
}