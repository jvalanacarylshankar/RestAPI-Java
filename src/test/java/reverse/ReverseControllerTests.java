package reverse;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseControllerTests {

	// Test empty path 
	@Test
	public void emptyMessage() throws Exception {
		ReverseController reverseController = new ReverseController();
        String result = reverseController.empty();
        assertEquals(result, "Empty string given. Try /reverse/{word}");
	}

	// Test reverse path and that the string is correctly reversed
	@Test
	public void reversedMessage() throws Exception {
		ReverseController reverseController = new ReverseController();
        String result = reverseController.reverse("test-string");
        assertEquals(result, "gnirts-tset");
	}
}
