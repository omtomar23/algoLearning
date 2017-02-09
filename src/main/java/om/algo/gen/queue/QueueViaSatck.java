package om.algo.gen.queue;

import java.util.Stack;

public class QueueViaSatck<E> implements IQueue<E>
{
	private Stack<E> s1;
	private Stack<E> s2;
	public QueueViaSatck()
	{
		s1 = new Stack<E>();
		s2 = new Stack<E>();
	}
	public void enqueue(E element) 
	{
		s1.push(element);
	}

	public E dequeue() 
	{
		if(s1.isEmpty() && s2.isEmpty())
		{
			return null;
		}
		if(s2.isEmpty())
		{
			for(int i = 0; i < s1.size() -1; i++)
			{
				s2.push(s1.pop());
			}
			return s1.pop();
		}
		return s2.pop();
	}

	public boolean isEmpty() 
	{
		return s1.empty() && s2.isEmpty();
	}

	public boolean isFull() 
	{
		return false;
	}
	
}
