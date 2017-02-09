package om.algo.gen.queue;

public interface IQueue<E> 
{
	void enqueue(E element);
	E dequeue();
	boolean isEmpty();
	boolean isFull();
	int size();
}
