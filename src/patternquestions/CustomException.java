package patternquestions;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try(Scanner scanner=new Scanner(System.in);)
		{
			
			System.out.println("Enter your age : ");
			int age=scanner.nextInt();
			Vote1 vote=new Vote1();
			vote.check(age);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

class InvalidAgeException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String str)
	{
		super(str);
	}

}


class Vote1
{
	void check(int age) throws InvalidAgeException
	{
		if(age>=18)
		{
			System.out.println("Eligible for voting!!");
		}
		else
		{
			throw new InvalidAgeException("Not eligible as age is below 18 years");
		}
	}
}