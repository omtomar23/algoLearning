package om.algo.sorting;

public class QuickSorter implements Sorter
{
	public void sort(int[] arr)
	{
		qSort(arr, 0, arr.length -1);
	}
	
	private void qSort(int[] arr, int startIndex, int lastIndex)
	{
		if(startIndex < lastIndex)
		{
			int p = partition(arr, startIndex, lastIndex);
			qSort(arr, startIndex, p);
			qSort(arr, p + 1, lastIndex);
		}
	}

	private int partition(int[] arr, int startIndex, int lastIndex) 
	{
		int x = arr[startIndex];
		int i = startIndex - 1;
		int j = lastIndex + 1;
		while(true)
		{
			do
			{
				j--;
			}while(arr[j] > x);
			
			do
			{
				i++;
			}while(arr[i] < x);
			
			if(i < j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			else
			{
				return j;
			}
		}
	}
}

