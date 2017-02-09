package om.algo.stack;

public class CustomFixStack<T> 
{
	private Object[] elements;
	private int count;
	public CustomFixStack(int capacity)
	{
		if(capacity < 0)
			throw new IllegalArgumentException("Capacity Not Valid");
		
		elements = new Object[capacity];
	}
	
	public boolean isStackFull()
	{
		return count == elements.length;
	} 
	public boolean isStackEmpty()
	{
		return count == 0;
	}
	
	public void push(T element)
	{
		if(element == null)
			throw new IllegalArgumentException("Element Must Not Be Null");
		if(isStackFull())
			throw new RuntimeException("Stack Over Flow Exception");
		elements[count++] = element;
	}
	
	public T pop()
	{
		if(isStackEmpty())
			throw new RuntimeException("Stack Unfer Flow Exception");
		
		@SuppressWarnings("unchecked")
		T element = (T)elements[--count];
		elements[count] = null;
		return element;
	}
	
	public int size()
	{
		return count;
	}
}
