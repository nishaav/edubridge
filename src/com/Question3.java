package com;

import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question3 question=new Question3();
		question.enrolmentProcess();
	}
	
	
	void enrolmentProcess()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome Learner!!\nPlease enter your total aggregate for 10+2 : ");
		double per=scanner.nextDouble();
		if((per>=90) && (per<=100))
		{
			System.out.println("Congratulations!! You are eligible for the enrolment process..\nPlease provide your choice : ");
			System.out.println("Press 1 for BCA\nPress 2 for Maths(H)");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Please enter your C.S. Marks to proceed :");
					int cs=scanner.nextInt();
					if((cs>=95) && (cs<=100))
					{
						System.out.println("Congratulations!! Your enrolment is successful for BCA");
					}
					else if((cs>=0) && (cs<95))
					{
						System.out.println("Sorry!! You are not eligible for the enrolment process of BCA");
					}
					else
					{
						System.out.println("Invalid Marks for CS..Please check and enter again!!");
					}
			break;
			case 2: System.out.println("Please enter your Maths marks to proceed : ");
					int maths=scanner.nextInt();
					if((maths>=98) && (maths<=100))
					{
						System.out.println("Congratulations!! Your enrolment is successful for Maths(H)");
					}
					else if((maths>=0) && (maths<98))
					{
						System.out.println("Sorry!! You are not eligible for the enrolment process of Maths(H)");
					}
					else
					{
						System.out.println("Invalid Marks for Maths(H)..Please check and enter again!!");
					}
			break;
			default: System.out.println("Invalid choice option..Please check and enter again!!");
			}
		}
		else if((per>=0)&&(per<90))
		{
			System.out.println("Sorry!! You are not eligible for the application process");
		}
		else
		{
			System.out.println("Invalid Input...Please check and enter again!!");
		}
	}

}
