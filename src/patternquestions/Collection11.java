package patternquestions;
import java.util.*;

public class Collection11 {

	public static void main(String[] args) {
		//Question : 
		//take input from user in an array int atleast 5 elements
		//convert it into a set collection
		//search for the highest element of the array.
		//max 4 to 5 
		System.out.println("Enter the size of array : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Enter "+number+" elements of integer type : ");
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < number; i++) {
			list.add(scanner.nextInt());
		}
		scanner.close();
		TreeSet<Integer> set = new TreeSet<>(list);
		System.out.println(set.last());
		
	}

}
