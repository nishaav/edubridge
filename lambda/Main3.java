package com.dummy;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your percentage : ");
		double percentage=scanner.nextDouble();
		GradeCalc gc=(per)->{
			if((per>=85)&&(per<=100))
			{
				return "A";
			}
			else if((per>=70)&&(per<85))
			{
				return "B";
			}
			else if((per>=55)&&(per<70))
			{
				return "C";
			}
			else if((per>=40)&&(per<55))
			{
				return "D";
			}
			else
			{
				return "Fail";
			}
		};
		String result=gc.grade(percentage);
		System.out.println(result);
	}

}
//lambda expression 
interface GradeCalc
{
	String grade(double per);
}
/*
 * 85-100 A
 * 70-85 B
 * 55-70 C
 * 40-55 D
 * below 40 Fail
 *
 *10 minutes : 
 */


