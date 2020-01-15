package kataWithGradle;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamsTest {

//	@Test
	public void canProduceEvenNumbers() throws Exception {
		Streams underTest = new Streams();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		int[] result = underTest.produceEvens(list);
		int[] expectedOutput = new int[]{0,2,4,6,8};
		
		
		list.forEach(System.out::println);
		
		assertArrayEquals(result, expectedOutput);
	}
	
	//Source for the next few micro kata:
	//https://technologyconversations.com/2014/11/04/java-8-streams-micro-katas/
	
//	@Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
		Streams underTest = new Streams();
		String[] input = new String[] {"My", "name", "is", "John", "Doe"};
		List<String> inputList = Arrays.asList(input);
		List<String> result = underTest.capitalizer(inputList);
		
		//Gratuitous use of the method reference operator (`::`) for demonstration purposes
		Stream<String> stream = Stream.of("Howzit", "howzit");
		stream.forEach(System.out::println);
					 //class     ::function 
		
		String[] expected = new String[] {"MY", "NAME", "IS", "JOHN", "DOE"};
        List<String> expectedList = Arrays.asList(expected);
        assertEquals(result, expectedList);
    }
	
    @Test
//  Filter collection so that only elements with less then 4 characters are returned.
    public void transformShouldFilterCollection() {
        Streams underTest = new Streams();
    	
    	String[] input = new String[] {"My", "name", "is", "Chuck", "Norris"};
    	List<String> inputList = Arrays.asList(input);
    	
    	String[] expectedStrings = new String[] {"My", "is"}; 
        List<String> expected = Arrays.asList(expectedStrings);
        
        List<String> result = underTest.fourCharsAndUnder(inputList);
        
        assertEquals(result, expected);
    }
    
    
}
