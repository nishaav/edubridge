package patternquestions;

public class PatternInArray {

	public static void main(String[] args) {

		char ch[]={'H','E','L','L','O'};
		/*
		 * H
		 * H E
		 * H E L
		 * H E L L 
		 * H E L L O
		 * 
		 * 
		 * 
		 * C O B O L
		 * O B O L
		 * B O L
		 * O L
		 * L
		 * 
		 * GO FOR SECOND QUESTION:
		 * find the highest number from 1-D array
		 * 
		 */
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch[j]+" ");
			}
			System.out.println();
		}
		
	}

}
