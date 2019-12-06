package reverse;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/reverse")
	public Reverse reverse(@RequestParam(value="name", defaultValue="World") String name) {
		return new Reverse(counter.incrementAndGet(),
							String.format(template, name));
	}
}
