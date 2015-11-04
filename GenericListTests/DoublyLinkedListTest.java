import org.junit.*;
import static org.junit.Assert.*;
/*
* Week 6 Day 1
* Exercise 5. Testing Dynamic Structures
* tests a doubly linked list from day 7
* Sarah Connor
*/
public class DoublyLinkedListTest {
	
	Company test;

	@Before
	public void initialize(){
		test = new Company();
	}
	
	
	@Test
	public void testsToString(){
		assertEquals(" ", test.toString());
	}
	
	@Test
	public void testsAddEmployee(){
		String input = "Bob Loblaw";
		test.add(input);
		assertEquals(input, test.getEmployees().toString());
	}
	
	@Test
	public void testsAddNIN(){
		String expected = "666";
		test.add(666);
		assertEquals(expected, test.getNIN().toString());
	}
	
	@Test
	public void testsRemoveEmployee(){
		String expected = "";
		String input = "Bob Loblaw";
		test.add(input);
		test.remove(input);
		assertEquals(expected, test.getEmployees().toString());
	}
	
	@Test
	public void testsRemoveNIN(){
		String expected = "";
		test.add(666);
		test.remove(666);
		assertEquals(expected, test.getNIN().toString());
	}
	
}