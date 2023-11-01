package com.test;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/home")
	public String home() {
		return "welcome to homepage";
	}

	@GetMapping("/users")
	public String users() {
		return "welcome to USER page";
	}

	@GetMapping("/admins")
	public String admins() {
		return "welcome to ADMIN page";
	}

	@GetMapping("/user")
	@ResponseBody
	public Principal user(Principal principal) {
		return principal;

	}

	@GetMapping("/admin")
	@ResponseBody
	public Principal admin(Principal principal) {
		return principal;

	}
}
