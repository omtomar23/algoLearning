package om.algo.gen.queue;

public class QueueMain 
{
	public static void main(String[] args) 
	{
		IQueue<Integer> iQueue = new QueueViaSatck<Integer>();
		iQueue.enqueue(2);
		iQueue.enqueue(3);
		//System.out.println(iQueue);
		System.out.println(iQueue.dequeue());
		System.out.println(iQueue.dequeue());
		
		//System.out.println(iQueue);
		System.out.println("------------------");
		iQueue.enqueue(4);
		iQueue.enqueue(6);
		//System.out.println(iQueue);
		System.out.println(iQueue.dequeue());
		System.out.println(iQueue.dequeue());
		
		//System.out.println(iQueue);
	}
}
