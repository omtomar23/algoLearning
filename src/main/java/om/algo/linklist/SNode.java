package om.algo.linklist;

public class SNode<E>
{
	private E element;
	private SNode<E> next;
	
	public SNode(E element, SNode<E> next)
	{
		this.element = element;
		this.next = next;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public SNode<E> getNext() {
		return next;
	}

	public void setNext(SNode<E> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "SNode [element=" + element + ", next=" + next + "]";
	}
}
