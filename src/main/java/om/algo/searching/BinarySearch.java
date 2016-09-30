package om.algo.searching;

public class BinarySearch
{
	public static boolean isElementExist(int[] arr, int element)
	{
		int startIndex = 0;
		int endIndex = arr.length - 1;
		while(startIndex <= endIndex)
		{
			int mid = startIndex + (endIndex - startIndex)/2;
			if(arr[mid] == element)
			{
				return true;
			}

			if(arr[mid] > element)
			{
				endIndex = mid - 1;
			}
			else
			{
				startIndex = mid + 1;
			}
		}

		return false;
	}
	
	public static void main(String[] args)
	{
		System.out.println(isElementExist(new int[]{3,4,5,6,7}, 47));
	}
}
