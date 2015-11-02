import org.junit.*;
import static org.junit.Assert.*;
/*
* Week 6 Day 1
* Exercise 2. Testing Mathematical Functions
* tests the hash functions from day 7
* Sarah Connor
*/
public class HashTest {
	
	MyMap testMap;

	@Before
	public void initialize(){
		testMap = new MyMap();
	}
	
	@Test
	public void testsShortHash() {
		String input = "Dereck Robert Yssirt";
		int output = testHash(input);
		int expected = 852;
		assertEquals(expected, output);
	}
	
	@Test
	public void testsShortHash2() {
		String input = "";
		int output = testHash(input);
		assertNotNull(output);
	}
	
	@Test
	public void testsIsEmpty() {
		assertTrue(testMap.isEmpty());
	}
	
	@Test
	public void testsIsEmpty2() {
		int hash = helperPut("Bob Schmert");
		assertFalse(testMap.isEmpty());
	}
	
	@Test
	public void testsGet() {
		String input = "Schmerbert";
		int hash = helperPut(input);
		String output = testMap.get(hash);
		assertEquals(input, output);
	}
	
	@Test
	public void testsGetMulti() {
		String input = "Schmernie";
		String expected = "Schmernie, Schmernie";
		int hash = helperPut(input);
		int hash2 = helperPut(input);
		String output = testMap.get(hash);
		assertEquals(expected, output);
	}
	
	@Test
	public void testsRemove(){
		int hash = helperPut("Mary Berry");
		int hash2 = helperPut("Mary Berry");
		testMap.remove(hash);
		assertTrue(testMap.isEmpty());
	}
	
	private int testHash(String input){
		HashUtilities testHash = new HashUtilities();
		int hash = input.hashCode();
		int output = testHash.shortHash(hash);
		return output;
	}
	
	private int helperPut(String input){
		int hash = testHash(input);
		testMap.put(hash, input);
		return hash;
	}
	
	
	
}