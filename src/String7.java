package stringHandling;

public class String7 {

	public static void main(String[] args) {
		// StringBuilder
		// ->it is mutable
		//StringBuffer
		
		//Both the classes are same except one difference that StringBuilder is non-synchronized whereas StringBuffer is synchronized
		//Synchronization : when two activities/operations occurs at same time that process is referred as Synchronization
		//Synchronization in java : when multiple threads tries to access the same resource.
		
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Hey!");
		System.out.println(sb);
		sb.append("I am working ");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(20);//to allocate a specific amount of capacity to the instance.
		//new capacity=(old capacity*2)+2;
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.isEmpty());
		System.out.println(sb.indexOf("!"));
		System.out.println(sb.insert(3, " User"));
		System.out.println(sb.charAt(8));
		System.out.println(sb.equals("Hey"));
		System.out.println(sb.indexOf("w", 16));
		System.out.println(sb.lastIndexOf("e"));
		System.out.println(sb.lastIndexOf("e", 7));
		System.out.println(sb.length());
		System.out.println(sb.substring(4, 10));
		System.out.println(sb.reverse());
		sb.trimToSize();
		System.out.println(sb.capacity());
		sb.setCharAt(0, 'h');
		System.out.println(sb);
		
		
		
	}
}