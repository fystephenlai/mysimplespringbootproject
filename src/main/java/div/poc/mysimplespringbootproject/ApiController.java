package div.poc.mysimplespringbootproject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {
	@GetMapping(value = "/hi")
	public ResponseEntity<String> f() {
		return new ResponseEntity<>("hihi 111111", HttpStatus.OK);
	}
}
