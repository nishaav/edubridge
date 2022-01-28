package patternquestions;

public interface StackImpl<T> {
	void push(T value);
	T pop();
	T top();
	boolean isEmpty();
	int size();
	int search(T o);
}
