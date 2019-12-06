package reverse;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

	private static final String default_string = "Empty string given. Try /reverse/{word}";

	@RequestMapping(path="/reverse/{word}")
	public String reverse(@PathVariable("word") String word) {
		String reverse_word = "";
		for (int i = word.length() - 1; i >= 0; i--) {
            reverse_word = reverse_word + word.charAt(i);
			}
		return reverse_word;
		}

	@RequestMapping(path="/")
	public String empty() {
		return default_string;
		}
}
