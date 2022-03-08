package streamApi;
import java.util.stream.*;

public class StreamApi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("for loop : ");

		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
//looping in stream
		System.out.println("Looping in Stream : ");
		
		Stream.iterate(1, i->i+1)
		.limit(10)
		.forEach(System.out::println);
		System.out.println("Even Numbers : ");
		Stream.iterate(1, i->i+1)
		.filter(i->i%2==0)
		.limit(10)
		.forEach(System.out::println);
		
	}

}
