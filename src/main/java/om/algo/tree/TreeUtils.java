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
}
