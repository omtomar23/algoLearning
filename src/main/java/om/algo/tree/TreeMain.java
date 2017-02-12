package om.algo.tree;

public class TreeMain 
{
	/**
	 *  			1
	 * 		10				11
	 * 20		30		22		33
	 * @return
	 */
	private static TNode<Integer> createDummyTree()
	{
		TNode<Integer> node20 = new TNode<Integer>(null, 20, null);
		TNode<Integer> node30 = new TNode<Integer>(null, 30, null);
		TNode<Integer> node10 = new TNode<Integer>(node20, 10, node30);
		TNode<Integer> node22 = new TNode<Integer>(null, 22, null);
		TNode<Integer> node33 = new TNode<Integer>(null, 33, null);
		TNode<Integer> node11 = new TNode<Integer>(node22, 11, node33);
		TNode<Integer> node1 = new TNode<Integer>(node10, 1, node11);
		return node1;
	}
	public static void main(String[] args) 
	{
		int arr[] = new int[3];
		TreeUtils.calculateLevelwiseSum(createDummyTree(), arr, 0);
		for(int sum: arr)
		{
			System.out.println(sum);
		}
	}
}
