package om.algo.tree;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
/**
 * Test For TreeUtils
 * @author Om
 */
public class TreeUtilsTest
{
	@Test(expected=IllegalArgumentException.class)
	public void whenRootIsNull_preopder_shouldThrowException()
	{
		TreeUtils.preOrder(null);
	}
	
	@Test
	public void whenTreeHasOnlyOneNode_preopder_shouldReturnListWithOneElements()
	{
		TNode<Integer> root = new TNode<Integer>(null, 1, null);
		List<Integer> preOrderList = TreeUtils.preOrder(root);
		assertThat(preOrderList.size(), is(1));
		assertThat(preOrderList.get(0), is(1));
	}
	
	@Test
	public void whenTreeHasTwoNode_preopder_shouldReturnListWithTwoElements()
	{
		TNode<Integer> child1 = new TNode<Integer>(null, 2, null);
		TNode<Integer> root = new TNode<Integer>(child1, 1, null);
		List<Integer> preOrderList = TreeUtils.preOrder(root);
		assertThat(preOrderList.size(), is(2));
		assertThat(preOrderList.get(0), is(1));
		assertThat(preOrderList.get(1), is(2));
	}
	
	@Test
	public void whenTreeHasSevenNode_preopder_shouldReturnListWithSevenElements()
	{
		TNode<Integer> node22 = new TNode<Integer>(null, 22, null);
		TNode<Integer> node33 = new TNode<Integer>(null, 33, null);
		TNode<Integer> node11 = new TNode<Integer>(node22, 11, node33);
		
		TNode<Integer> node20 = new TNode<Integer>(null, 20, null);
		TNode<Integer> node30 = new TNode<Integer>(null, 30, null);
		TNode<Integer> node10 = new TNode<Integer>(node20, 10, node30);
		
		TNode<Integer> root = new TNode<Integer>(node10, 1, node11);
		List<Integer> preOrderList = TreeUtils.preOrder(root);
		assertThat(preOrderList.size(), is(7));
		assertThat(preOrderList.get(0), is(1));
		assertThat(preOrderList.get(1), is(10));
		assertThat(preOrderList.get(2), is(20));
		assertThat(preOrderList.get(3), is(30));
		assertThat(preOrderList.get(4), is(11));
		assertThat(preOrderList.get(5), is(22));
		assertThat(preOrderList.get(6), is(33));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void whenRootIsNull_inOrder_shouldThrowException()
	{
		TreeUtils.inOrder(null);
	}
	
	@Test
	public void whenTreeHasOnlyOneNode_inOrder_shouldReturnListWithOneElements()
	{
		TNode<Integer> root = new TNode<Integer>(null, 1, null);
		List<Integer> inOrderList = TreeUtils.inOrder(root);
		assertThat(inOrderList.size(), is(1));
		assertThat(inOrderList.get(0), is(1));
	}
	
	@Test
	public void whenTreeHasTwoNode_inOrder_shouldReturnListWithTwoElements()
	{
		TNode<Integer> child1 = new TNode<Integer>(null, 2, null);
		TNode<Integer> root = new TNode<Integer>(child1, 1, null);
		List<Integer> inOrderList = TreeUtils.inOrder(root);
		assertThat(inOrderList.size(), is(2));
		assertThat(inOrderList.get(0), is(2));
		assertThat(inOrderList.get(1), is(1));
	}
	
	@Test
	public void whenTreeHasSevenNode_inOrder_shouldReturnListWithSevenElements()
	{
		TNode<Integer> node22 = new TNode<Integer>(null, 22, null);
		TNode<Integer> node33 = new TNode<Integer>(null, 33, null);
		TNode<Integer> node11 = new TNode<Integer>(node22, 11, node33);
		
		TNode<Integer> node20 = new TNode<Integer>(null, 20, null);
		TNode<Integer> node30 = new TNode<Integer>(null, 30, null);
		TNode<Integer> node10 = new TNode<Integer>(node20, 10, node30);
		
		TNode<Integer> root = new TNode<Integer>(node10, 1, node11);
		List<Integer> preOrderList = TreeUtils.inOrder(root);
		assertThat(preOrderList.size(), is(7));
		assertThat(preOrderList.get(0), is(20));
		assertThat(preOrderList.get(1), is(10));
		assertThat(preOrderList.get(2), is(30));
		assertThat(preOrderList.get(3), is(1));
		assertThat(preOrderList.get(4), is(22));
		assertThat(preOrderList.get(5), is(11));
		assertThat(preOrderList.get(6), is(33));
	}


}
