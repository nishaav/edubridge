package patternquestions;

import java.util.*;
public class Collection8 {

	public static void main(String[] args) {
		// STACK class : 
		/*
		 * STACK : LIFO(Last In First Out)
		 * FILO :(First In Last Out)
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		Stack<String> stack=new Stack<>();
		stack.push("Element 1");
		stack.push("Element 2");
		stack.push("Element 3");
		stack.push("Element 4");
		stack.push("Element 5");
		stack.push("Element 6");
		stack.add(0, "Element 0");
		System.out.println(stack);
		stack.pop();
		stack.remove(0);
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.empty());
		System.out.println(stack.search("Element 5"));//1 based position therefore it will never return 0 as it is not based on index.
		System.out.println(stack.search("Element 20"));

	}

}
