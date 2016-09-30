package om.algo.gen;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArraysUtils
{
	/**
	 * @param arr
	 * @param num
	 */
	public static void findAllPairsWhoseSumEqualToGivenNumber(int[] arr, int num)
	{
		Set<Integer> set = new HashSet<Integer>();
		for(int value: arr)
		{
			int remaining = num - value;
			if(!set.contains(remaining))
			{
				set.add(value);
			}
			else
			{
				System.out.println(remaining +" ,"+ value);
			}
		}
	}
	
	public static Integer[] removeDuplicateElement(int[] arr)
	{
		HashSet<Integer> set = new HashSet<Integer>();  
		for(int i = 0; i < arr.length ; i++)
		{
			set.add(arr[i]);
		}
		return set.toArray(new Integer[set.size()]);
	}
	
	public static int firstNonRepeatedElement(int[] arr)
	{
		Map<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int value: arr)
		{
			if(map.containsKey(value))
			{
				int repeatedCount = map.get(value);
				map.put(value, ++repeatedCount);
			}
			else
			{
				map.put(value, 1);
			}
		}
		
		int firstNonRepetedValue = - 1;
		for (Entry<Integer, Integer> entry : map.entrySet()) 
		{
			if(entry.getValue() == 1)
			{
				firstNonRepetedValue = entry.getKey();
				break;
			}
		}
		
		return firstNonRepetedValue;
	}
	
	public static void main(String[] args) 
	{
		findAllPairsWhoseSumEqualToGivenNumber(new int[]{2,5,3,3,7,8}, 5);
		
		System.out.println(Boolean.parseBoolean("kkkkkkkk"));
	}

}
