import org.junit.*;
import static org.junit.Assert.*;
/*
* Week 6 Day 1
* Exercise 5. Testing Dynamic Structures
* tests a doubly linked list from day 7
* Sarah Connor
*/
public class DoublyLinkedListTest {
	
	Patient test;

	@Before
	public void initialize(){
		test = new Patient();
	}
	
	
	@Test
	public void testsCount() {
		assertEquals(0, test.countPatients());
	}
	
	@Test
	public void testsToString(){
		assertEquals("", test.toString());
	}
	
	@Test
	public void testsAddPatient(){
		Patient input = new Patient("Bob Loblaw", 70, "Hernia");
		test.addPatient(input);
		assertEquals(1, test.countPatients());
	}
	
}