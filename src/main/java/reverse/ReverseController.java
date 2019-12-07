package reverse;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

	private static final String default_string = "Empty string given. Try /reverse/{word}";

	// Mapping for /reverse
	@RequestMapping(path="/reverse/{word}")
	public String reverse(@PathVariable("word") String word) {
		String reverse_word = "";
		for (int i = word.length() - 1; i >= 0; i--) {
            reverse_word = reverse_word + word.charAt(i);
			}
		return reverse_word;
		}

	// Mapping for empty path
	@RequestMapping(path="/")
	public String empty() {
		return default_string;
		}
}

/* Reasoning for not abstracting the reverse functionality into another class:
- I feel the function is quite simple and did not require an additional class to store this functionality.
- However, if there were more paths, each of which had something to do with strings, I would create a new class and abstract that functionality into it.
*/
