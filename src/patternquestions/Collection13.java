package patternquestions;
import java.util.*;
public class Collection13 {

	public static void main(String[] args) {
LinkedHashSet<Integer> set = new LinkedHashSet<>();
		System.out.println("ENter the count of elements : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("ENter "+number+" elements : ");
		for(int i = 0; i < number; i++) {
			set.add(scanner.nextInt());
		}
		
		scanner.close();
		
		// using treeset
		TreeSet<Integer> treeSet = new TreeSet<>(set);
		System.out.println(treeSet.last());
		
		// using sort() method
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		
		// without treeset and sort() method
		int max = -1;
		for(Integer i: set) {
			if(i > max)
				max = i;
		}
		
		System.out.println(max);


	}

}
