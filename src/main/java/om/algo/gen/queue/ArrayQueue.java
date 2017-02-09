package om.algo.gen.queue;

public class ArrayQueue<E> implements IQueue<E>
{
	private int capacity;
	private Object[] elements;
	private int front = -1;
	private int rear = -1;
	private int size = 0 ;
	public ArrayQueue(int capacity)
	{
		this.capacity = capacity;
		elements = new Object[capacity];
	}
	
	public void enqueue(E element) 
	{
		if(isFull())
			throw new RuntimeException("Queue has been full.");
		rear = (rear + 1)% capacity;
		elements[rear] = element;
		size++;
		if(front == -1)
			front = rear;
	}

	public E dequeue() 
	{
		if(isEmpty())
			throw new RuntimeException("Queue has been empty.");
		
		@SuppressWarnings("unchecked")
		E element = (E)elements[front];
		elements[front] = null;
		size--;
		if(front == rear)
		{
			front = -1;
		}
		else
		{
			front = (front + 1)%capacity;
		}
		
		return element;
	}

	public boolean isEmpty() 
	{
		return front == -1;
	}

	public boolean isFull() 
	{
		return (rear + 1)%capacity == front;
	}

	@Override
	public String toString() {
		return "ArrayQueue [isEmpty()=" + isEmpty() + ", isFull()=" + isFull()
				+ "]";
	}

	public int size() 
	{
		return size;
	}
}
