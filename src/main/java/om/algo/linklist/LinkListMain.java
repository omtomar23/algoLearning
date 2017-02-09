package om.algo.linklist;

public class LinkListMain 
{
	public static void main(String[] args) 
	{
		SLinkList<Integer> linkList = new SLinkList<Integer>();
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		System.out.println("Size="+linkList.size());
		linkList.print();
		System.out.println("*******************");
		linkList.remove(2);
		System.out.println("Size="+linkList.size());
		linkList.print();
		System.out.println("------------------");
		linkList.reverse();
		linkList.print();
	}
}
