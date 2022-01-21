package patternquestions;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		int ar[][]=new int [2][3];
		
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter 5 elements : ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar[i][j]=scanner.nextInt();
			}
			
		}
		
		System.out.println("The elements of the array are : ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		int ar1[][]= {{23,45,67},{12,90,78}};//2X3
		System.out.println("The elements of the array are : ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ar1[i][j]+" ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
