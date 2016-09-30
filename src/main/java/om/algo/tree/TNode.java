package om.algo.tree;

public final class TNode<E>
{
	private TNode<E> left;
	private E element;
	private TNode<E> right;
	
	public TNode(TNode<E> left, E element, TNode<E> right)
	{
		this.left = left;
		this.element = element;
		this.right = right;
	}

	public TNode<E> getLeft()
	{
		return left;
	}

	public void setLeft(TNode<E> left) 
	{
		this.left = left;
	}

	public E getElement()
	{
		return element;
	}

	public void setElement(E element) 
	{
		this.element = element;
	}

	public TNode<E> getRight() 
	{
		return right;
	}

	public void setRight(TNode<E> right)
	{
		this.right = right;
	}

	@Override
	public String toString()
	{
		return "TNode [left=" + left + ", element=" + element + ", right="
				+ right + "]";
	}
}
