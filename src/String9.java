package stringHandling;
import java.util.Scanner;
//Akshat Q1
public class String9 {

	public static void main(String[] args) 
	{
		          System.out.print("Enter a string: "); 
		          Scanner sc= new Scanner(System.in);
			      String myString =  sc.nextLine();  ;
			      StringBuffer buffer = new StringBuffer();
			      buffer.append(myString);
			      buffer.reverse();
			      String data = buffer.toString();
			      if(myString.equals(data)){
			         System.out.println("Given String is palindrome");
			      }else{
			         System.out.println("Given String is not palindrome");
			      }
			      sc.close();
	}
			
}

