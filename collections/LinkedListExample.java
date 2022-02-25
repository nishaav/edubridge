package collections;


import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// Create Integer LinkedList
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Add 10 elements from the user
		for (int i = 0; i < 10; i++) {
			linkedList.add(scan.nextInt());
		}
		System.out.println("LinkedList elements that are entered...");
		displayElements(linkedList);

		// Sort elements in ascending order
		System.out.println("LinkedList elements after sorting in ascending order...");
		Collections.sort(linkedList);
		displayElements(linkedList);

		// Sort elements in descending order
		System.out.println("LinkedList elements after sorting in descending order...");
		Collections.reverse(linkedList);
		displayElements(linkedList);

		// Return the highest and lowest element of the collection
		System.out.println("Display lowest and highest elements...");
		System.out.println(linkedList.peekLast());
		System.out.println(linkedList.peekFirst());

		// Find the most frequent element
		System.out.println("Finding the maximum repeated element...");
		int max = 0, count = 1, maxElement = 0;
		for (int i = 0; i < linkedList.size() - 1; i++) {
			count = 1;
			for (int j = i + 1; j < linkedList.size(); j++) {
				if (linkedList.get(i) == linkedList.get(j)) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				maxElement = linkedList.get(i);
			}
		}
		System.out.println(maxElement);
		scan.close();
	}

	public static void displayElements(LinkedList<Integer> linkedList) {
		Iterator<Integer> iterator = linkedList.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

}
