import org.junit.*;
import static org.junit.Assert.*;

/**
* Week 6 Day 12
* Polymorphism
* 1. Dont Repeat Yourself Test
* Sarah Connor
*/

public class ComparatorTest{

	
	Comparator test = new Comparator();
	
	@Test
	public void testGetMaxInt(){
		int test1 = 1;
		int test2 = 2;
		int output = test.getMax(test1, test2);
		assertEquals(2, output);
	}
	
	@Test
	public void testGetMaxDouble(){
		double test1 = 1;
		double test2 = 2;
		double output = test.getMax(test1, test2);
		assertEquals(2.0, output, 1);
	}
	
	@Test
	public void testGetMaxString(){
		String test1 = "1";
		String test2 = "2";
		String output = test.getMax(test1, test2);
		assertEquals("2", output);
	}
}