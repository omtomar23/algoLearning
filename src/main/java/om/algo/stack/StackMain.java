package om.algo.stack;

public class StackMain 
{
	
	public  static void customFixStackTest()
	{
		CustomFixStack<Integer> customStack = new CustomFixStack<Integer>(3);
		customStack.push(2);
		customStack.push(3);
		customStack.push(4);
		//customStack.push(5);
		System.out.println(customStack.pop() + " ,size="+ customStack.size());
		System.out.println(customStack.pop() + " ,size="+ customStack.size());
		System.out.println(customStack.pop() + " ,size="+ customStack.size());
		//System.out.println(customStack.pop() + " ,size="+ customStack.size());
		
		customStack.push(5);
		System.out.println(customStack.pop() + " ,size="+ customStack.size());
	
	}
	
	public static void stackViaQueueTest()
	{
		StackViaQueue<Integer> stack = new StackViaQueue<Integer>(2);
		stack.push(1);
		stack.push(2);
		System.out.println(stack.pop());
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
	public static void main(String[] args) 
	{
		stackViaQueueTest();
	}
}
