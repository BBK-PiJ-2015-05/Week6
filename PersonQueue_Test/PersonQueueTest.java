import org.junit.*;
import static org.junit.Assert.*;
/*
* Week 6 Day 1
* Exercise 4.2 Test Implementations of a given interface
* tests the Queue functions from day 8
* Sarah Connor
*/
public class PersonQueueTest {
	
	LinkedListPersonQueue testQueue;

	@Before
	public void initialize(){
		testQueue = new LinkedListPersonQueue();
	}
	
	@Test
	public void testsRetrieve() {
		Person input = new Person();
		testQueue.insert(input);
		Person output = testQueue.retrieve();
		assertEquals(input, output);
	}	
	
	@Test
	public void testsToString() {
		Person input = new Person();
		String expected = input.toString();
		testQueue.insert(input);
		String output = testQueue.toString();
		assertEquals(expected, output);
	}
	
	@Test
	public void testsToStringNull() {
		assertNotNull(testQueue.toString());
	}
}