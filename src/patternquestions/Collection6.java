package patternquestions;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class Collection6 {

	public static void main(String[] args) {
LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter the number of elements :");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		System.out.println("Enter "+number+"elements :");
		for(int i = 0; i < number; i++) {
			list.add(scanner.nextInt());
		}
	
		
		int max = -1, element = -1;
		for(int i = 0; i < list.size(); i++) {
			int count = 1;
			for(int j = i+1; j < list.size(); j++) {
				if(list.get(i) == list.get(j)) {
					count++;
				}
			}
			if(count >= max) {
				max = count;
				element = list.get(i);
			}
		}
		System.out.println(element);
		scanner.close();
		/*
		 * for(int j = i+1; j < list.size(); j++) {
				if(list.get(i) == list.get(j) && list.get(i) >= 0) {
					count++;
					list.set(j, -1);
				}
				
			}

		 */
	}
}
