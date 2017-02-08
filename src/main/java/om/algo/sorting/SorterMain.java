package om.algo.sorting;

public class SorterMain 
{
	public static void sort(int[] arr, Sorter sorter)
	{
		sorter.sort(arr);
	}
	
	public static void printArray(String message, int[] arr)
	{
		System.out.print(message + ":");
		for(int value: arr)
		{
			System.out.print(value + " ");
		}
		System.out.println("");
	}
	
	private static void sortByQuickSort(int[] arr)
	{
		Sorter sorter = new QuickSorter();
		sorter.sort(arr);
		printArray("Sorted By Quick Sort Algo",arr);
	}
	
	private static void sortByMergeSort(int[] arr)
	{
		Sorter sorter = new MergeSorter();
		sorter.sort(arr);
		printArray("Sorted By Merge Sort Algo",arr);
	}
	
	private static void sortByInsertionSort(int[] arr)
	{
		Sorter sorter = new InsertionSorter();
		sorter.sort(arr);
		printArray("Sorted By Insertion Sort Algo", arr);
	}
	
	private static void sortBySelectionSort(int[] arr)
	{
		Sorter sorter = new SelectionSorter();
		sorter.sort(arr);
		printArray("Sorted By Selection Sort Algo", arr);
	}
	
	public static void main(String[] args) 
	{
		sortByQuickSort(new int[]{4,6,1,5,77,22});
		sortByMergeSort(new int[]{2,7,1,5,3});
		//sortByInsertionSort(new int[]{4,6,1,5,77,22});
		//sortBySelectionSort(new int[]{4,6,1,5,77,22});
		
	}
}
