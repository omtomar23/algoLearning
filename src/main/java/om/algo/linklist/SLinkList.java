package om.algo.linklist;

public class SLinkList<E> 
{
	private int size;
	private SNode<E> head;
	private SNode<E> tail;
	
	public SLinkList(){}
	
	public void add(E element)
	{
		if(element == null)
			throw new IllegalArgumentException("Null not allowed");
		
		if(head == null)
		{
			head = tail= new SNode<E>(element, null);
		}
		else
		{
			SNode<E> newNode = new SNode<E>(element, null);
			tail.setNext(newNode);
			tail = newNode;
		}
		size++;
	}
	
	public void addFirst(E element)
	{
		if(element == null)
			throw new IllegalArgumentException("Null not allowed");
		
		if(head == null)
		{
			head = tail= new SNode<E>(element, null);
		}
		else
		{
			SNode<E> newNode = new SNode<E>(element, head);
			head = newNode;
		}
		
		size++;
	}
	
	public E getLast()
	{
		if(tail != null)
			return tail.getElement();
		
		throw new RuntimeException("List is empty");
	}
	
	public boolean removeFirst()
	{
		if(head == null)
			return false;
		
		head = head.getNext();
		if(size == 1)
		{
			tail = head;
		}
		size--;
		return true;
	}
	
	public boolean remove(E element)
	{
		if(element == null)
			throw new IllegalArgumentException("Null not allowed");

		if(head != null && head.getElement().equals(element))
		{
			return removeFirst();
		}
		
		SNode<E> temp = head;
		SNode<E> previous = null;
		while(temp != null)
		{
			if(temp.getElement().equals(element))
			{
				previous.setNext(temp.getNext());
				if(temp.getNext() == null)
					tail = previous;
				size--;
				return true;
			}
			previous = temp;
			temp = temp.getNext();
		}
		return false;
	}
	
	public boolean contains(E element)
	{
		if(element == null)
			throw new IllegalArgumentException("Null not allowed");
		SNode<E> node = findNodeByValue(element);
		return node == null? false: true;
	}
	
	private SNode<E> findNodeByValue(E element)
	{
		SNode<E> temp = head;
		while(temp != null)
		{
			if(temp.getElement().equals(element))
			{
				return temp;
			}
			temp = temp.getNext();
		}
		
		return null;
	}
	
	public void reverse()
	{
		SNode<E> current = head;
		SNode<E> previous = null, temp = null;
		while(current != null)
		{
			temp = current;
			current = temp.getNext();
			temp.setNext(previous);
			previous = temp;
		}
		
		tail = head;
		head = previous;
	}
	
	public int size()
	{
		return size;
	}
	
	public void print()
	{
		SNode<E> temp = head;
		while(temp != null)
		{
			System.out.println(temp.getElement());
			temp = temp.getNext();
		}
	}
}
