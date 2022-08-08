package org.nonny.com.usercontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/home")
	public String home() {
		
	
		return "Welcome to USER HOME PAGE";
	}

}
