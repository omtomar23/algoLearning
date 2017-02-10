package om.algo.stack;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueueWithOnlyOneQueue
{
	Queue<Integer> queue = new LinkedList<Integer>();

	public void push(int data)
	{
		queue.add(data);
		int size = queue.size();
		while (size > 1) {
			queue.add(queue.remove());
			size--;
		}
	}

	public void pop() 
	{
		if(queue.isEmpty()){
			System.out.println("No element present");
		}else{
			System.out.println(queue.poll());
		}
	}
	
	 public static void main(String[] args) 
	 {
		 StackUsingQueueWithOnlyOneQueue stackUsingOneQueue = new StackUsingQueueWithOnlyOneQueue();

		 stackUsingOneQueue.push(10);
		 stackUsingOneQueue.push(20);
		 stackUsingOneQueue.push(30);
		 stackUsingOneQueue.push(40);

		 stackUsingOneQueue.pop();
		 stackUsingOneQueue.pop();
		 stackUsingOneQueue.pop();

		 stackUsingOneQueue.push(50);
		 stackUsingOneQueue.push(60);

		 stackUsingOneQueue.pop();
		 stackUsingOneQueue.pop();
		 stackUsingOneQueue.pop();
		 stackUsingOneQueue.pop();
		 stackUsingOneQueue.pop();
		 stackUsingOneQueue.pop();
		 stackUsingOneQueue.pop();
	 }
}