package om.algo.sorting;

public class SelectionSorter implements Sorter
{
	public void sort(int[] arr)
	{
		for(int i = 0 ; i < arr.length; i++)
		{
			int minIndex = i;
			for(int j = i; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					minIndex = j;
				}
			}
			
			if(minIndex != i)
			{
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
}
