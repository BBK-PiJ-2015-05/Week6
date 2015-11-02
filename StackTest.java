import org.junit.*;
import static org.junit.Assert.*;

public class StackTest {
	
	PointerStringStack p;
	
	@Before
	public void initialize(){
		p = new PointerStringStack();
	}
	
	@Test
	public void testsIsEmpty() {
		assertTrue(p.isEmpty());
	}
	
	@Test
	public void testsPeek() {
		p.push(":)");
		String output = p.peek();
		String expected = ":)";
		assertEquals(output, expected);
	}
	
	@Test
	public void testsPop(){
		p.push(":)");
		String output = p.pop();
		String expected = ":)";
		assertEquals(output, expected);
	}
	
	@Test
	public void testsPop2(){
		p.push(":)");
		String output = p.pop();
		assertTrue(p.isEmpty());
	}
	
	
}