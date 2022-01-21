package patternquestions;

import java.util.Scanner;

public class ArrayWithPattern {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String inputString=scanner.nextLine();
		
		char ch[]=inputString.toCharArray();
		
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch[j]+" ");
			}
			System.out.println();
		}
		
		scanner.close();
		
		
		
	}

}
