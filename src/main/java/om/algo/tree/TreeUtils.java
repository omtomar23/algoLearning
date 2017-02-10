package om.algo.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Provide The Tree Functionality
 * @author Om
 *
 */
public class TreeUtils 
{
	private TreeUtils(){}
	
	/**
	 * N-->L-->R
	 * Input:
	 * 				1
	 * 		10				11
	 * 20		30		22		33
	 * Output:
	 * [1 10 20 30  11 22 33]
	 * 
	 */
	public static <E> List<E> preOrder(TNode<E> root)
	{
		if(root == null)
			throw new IllegalArgumentException("Root Should Not Be Null.");
		
		List<E> elements = new ArrayList<>();
		
		Stack<TNode<E>> stack = new Stack<TNode<E>>();
		stack.push(root);
		while(!stack.isEmpty())
		{
			TNode<E> temp = stack.pop();
			elements.add(temp.getElement());
			if(temp.getRight() != null)
			{
				stack.push(temp.getRight());
			}
			if(temp.getLeft() != null)
			{
				stack.push(temp.getLeft());
			}
		}
		
		return elements;
	}
	
	/**
	 * L-->N-->R
	 * Input:
	 * 				1
	 * 		10				11
	 * 20		30		22		33
	 * Output:
	 * [20 10 30 1  22 11 33]
	 * 
	 */
	public static <E> List<E> inOrder(TNode<E> root)
	{
		if(root == null)
			throw new IllegalArgumentException("Root Should Not Be Null.");
		
		List<E> elements = new ArrayList<>();
		
		Stack<TNode<E>> stack = new Stack<TNode<E>>();
		while(true)
		{
			while(root != null)
			{
				stack.push(root);
				root = root.getLeft();
			}
			if(stack.isEmpty())
				break ;
			
			TNode<E> temp = stack.pop();
			elements.add(temp.getElement());
			root = temp.getRight();
		}
		
		return elements;
	}
	
	/**
	 * L-->R-->N
	 * Input:
	 * 				1
	 * 		10				11
	 * 20		30		22		33
	 * Output:
	 * [20 30 10 22 33 11 1]
	 * 
	 */
	public static <E> List<E> postOrder(TNode<E> root)
	{
		if(root == null)
			throw new IllegalArgumentException("Root Should Not Be Null.");
		
		List<E> elements = new ArrayList<>();
		
		recPostOrder(elements, root);
		
		return elements;
	}
	
	private static <E> void recPostOrder(List<E> elements, TNode<E> root)
	{
		if(root != null)
		{
			recPostOrder(elements, root.getLeft());
			recPostOrder(elements, root.getRight());
			elements.add(root.getElement());
		}
	}
}
