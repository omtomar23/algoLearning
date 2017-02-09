package om.algo.stack;

import om.algo.gen.queue.ArrayQueue;
import om.algo.gen.queue.IQueue;

public class StackViaQueue<E>
{
	public IQueue<E> q1;
	public IQueue<E> q2;
	public StackViaQueue(int capacity)
	{
		q1 = new ArrayQueue<E>(capacity);
		q2 = new ArrayQueue<E>(capacity);
	}
	
	public void push(E element)
	{
		q1.enqueue(element);
	}
	
	public E pop()
	{
		if(q1.isEmpty() && q2.isEmpty())
			return null;
		
		if(!q1.isEmpty())
		{
			for(int i = 0; i <q1.size() - 1; i++ )
			{
				q2.enqueue(q1.dequeue());
			}
			return q1.dequeue();
		}
		else
		{
			for(int i = 0; i <q2.size() - 1; i++ )
			{
				q1.enqueue(q2.dequeue());
			}
			return q2.dequeue();
		}
	}
}
