import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	
	Person p;
	
	@Before
	public void initialize(){
		p = new Person();
	}
	
	@Test
	public void testsNormalName() {
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}
	
	@Test
	public void testsDoubleSpace(){
		String input = "Bert  Ernie";
		String output = p.getInitials(input);
		String expected = "BE";
		assertEquals(output, expected);
	}
}