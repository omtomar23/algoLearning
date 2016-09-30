package om.algo.sorting;

/**
 * Time Complexity: O(n*n)
 * Auxiliary Space: O(1)
 * Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. 
 * And it takes minimum time (Order of n) when elements are already sorted.
 * Algorithmic Paradigm: Incremental Approach
 * Uses: Insertion sort is uses when number of elements is small.
 * It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.
 * 
 * @author Om
 */
public class InsertionSorter implements Sorter
{
	public void sort(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			int key = arr[i];
			int j = i -1;
			for(; j >= 0 && arr[j] > key; j--)
			{
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = key; 
		}
	}
}
