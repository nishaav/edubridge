package patternquestions;

public class UserDefinedStack {

	public static void main(String[] args) {
		CustomStack<String> customStack=new CustomStack<>();
		customStack.push("Venkat");
		customStack.push("Vaishnavi");
		customStack.push("Arun");
		customStack.push("Sadhish");
		customStack.push("Jaya");
		
		System.out.println(customStack);
		System.out.println(customStack.top());
		System.out.println(customStack);
		System.out.println(customStack.size());
		System.out.println(customStack.isEmpty());
		System.out.println(customStack.pop());
		System.out.println(customStack);
		System.out.println(customStack.search("Arun"));
	}

}
