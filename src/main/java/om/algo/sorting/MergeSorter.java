package om.algo.sorting;

public class MergeSorter implements Sorter
{
	public void sort(int[] arr)
	{
		mSort(arr, 0, arr.length -1);
	}
	
	private void mSort(int[] arr, int startIndex, int lastIndex)
	{
		if(startIndex < lastIndex)
		{
			int mid = ( startIndex + lastIndex ) / 2;
			mSort(arr, startIndex, mid);
			mSort(arr, mid + 1, lastIndex);
			merge(arr, startIndex, mid, lastIndex);
		}
	}

	private void merge(int[] arr, int startIndex, int mid, int lastIndex) 
	{
		int n1 = mid - startIndex + 1;
		int n2 = lastIndex - mid;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		//copy data
		for(int i = 0 ; i < n1; i++)
		{
			L[i] = arr[startIndex + i];
		}
		for(int i = 0 ; i < n2; i++)
		{
			R[i] = arr[mid + i + 1];
		}
		
		int i = 0, j =0;
		int k = startIndex;
		while(i < n1 && j < n2)
		{
			if(L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		/* Copy remaining elements of L[] if any */
		while(i < n1)
		{
			arr[k] = L[i];
			k++;
			i++;
		}
		
		/* Copy remaining elements of L[] if any */
		while(j < n2)
		{
			arr[k] = R[j];
			k++;
			j++;
		}
	}
}
