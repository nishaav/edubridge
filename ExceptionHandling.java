package patternquestions;

import java.util.Scanner;

public class ExceptionHandling {

	static String str;
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
//		System.out.println("Hello");
//		
//		System.out.println(str.length());
//		
//		System.out.println("End of program!!");
		int ar[]=new int[5];// 0 to 4
		System.out.println("Enter values : ");
		for(int i=0;i<=ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		//defaultexceptionhandler
		
		

	}

}
