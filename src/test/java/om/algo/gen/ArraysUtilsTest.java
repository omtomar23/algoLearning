package om.algo.gen;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;


public class ArraysUtilsTest 
{
	@Test
	public void removeDuplicateArray_shoudReturnUniqueElementArray()
	{
		Integer[] elements = ArraysUtils.removeDuplicateElement(new int[]{2,2,3,5,5});
		assertThat(new int[]{2,3,5}, is(elements));
	}
	
	@Test
	public void whenInputHasOnlyOne_findFirstNonRepeatedValue_shoudReturnOnlyOneFirstNonRepeatedValue()
	{
		int value = ArraysUtils.firstNonRepeatedElement(new int[]{2,2,3,5,5});
		assertThat(value, is(3));
	}
	
	@Test
	public void whenInputHasTwo_findFirstNonRepeatedValue_shoudReturnOnlyOneFirstNonRepeatedValue()
	{
		int value = ArraysUtils.firstNonRepeatedElement(new int[]{2,4,3,5,5});
		assertThat(value, is(2));
	}
	
	@Test
	public void whenInputHasNonRepeated_findFirstNonRepeatedValue_shoudReturnMinusOne()
	{
		int value = ArraysUtils.firstNonRepeatedElement(new int[]{2,2,5,5});
		assertThat(value, is(-1));
	}
}
