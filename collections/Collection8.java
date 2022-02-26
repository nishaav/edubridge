package collections;

import java.util.*;

public class Collection8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Stack class :
		//push : insert
		//pop : remove
		//LIFO or FILO
		//LIFO : Last In First Out
		//FILO : First In Last Out
		//bundle of books:
		
		Stack<String> stack=new Stack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		
		Stack<String> stack2=(Stack<String>)stack.clone();
		
		
		stack.push("F");
		stack.push("G");
		stack.push("H");
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.capacity());
		System.out.println(stack.empty());
		stack.remove("D");
		System.out.println(stack);
		System.out.println(stack2);
		System.out.println(stack.containsAll(stack2));
		System.out.println(stack.equals(stack2));
		
		stack.pop();
		System.out.println(stack);
		
		stack.remove(0);
		System.out.println(stack);
		
		System.out.println(stack.search("G"));
		
		
		
	}

}
