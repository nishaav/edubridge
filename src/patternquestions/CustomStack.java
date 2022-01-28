package patternquestions;

public class CustomStack<T> implements StackImpl<T> {

		CustomStack<T> previous;
		T value;
	
		
	public CustomStack()
	{
		
	}
		
	
	public CustomStack(T value) {
			super();
			this.value = value;
		}

	public CustomStack(CustomStack<T> previous, T value) {
			super();
			this.previous = previous;
			this.value = value;
		}


	@Override
	public void push(T value) {
		// TODO Auto-generated method stub
	if(this.value==null)
	{
		
		this.value=value;
	}
	else
	{
		this.previous=new CustomStack<T>(this.previous,this.value);
		this.value=value;
	}
		
		
		
	}

	@Override
	public T pop() {
		if(this.isEmpty())
		{
			throw new IllegalArgumentException("Stack is empty");
		}
		T top=this.value;
		this.value=this.previous.value;
		this.previous=this.previous.previous;
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	public T top() {
		// TODO Auto-generated method stub
		return this.value;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.previous==null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		if(this.isEmpty())
		{
			return 0;
		}
		else
		{
			return 1+this.previous.size();
		}
	}

	@Override
	public int search(T o) {
		int count=1;
		for(CustomStack<T> cs=this;!cs.isEmpty();cs=cs.previous)
		{
			if(cs.value.equals(o))
			
				return count;
			
			count++;
			
		}
		return -1;
	
	}

	public String toString()
	{
		if(!this.isEmpty())
			return this.previous+" "+this.value;
		return this.value !=null?String.valueOf(this.value):"Blank";
	}

	
}
