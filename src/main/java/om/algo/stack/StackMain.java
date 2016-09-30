package om.algo.stack;

public class StackMain 
{
	public static void main(String[] args) 
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
}
