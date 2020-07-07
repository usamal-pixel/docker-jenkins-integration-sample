package in.samal.gitjenkinsdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	
	@GetMapping("/welcome")
	public String info() {
		
		return "Welcome to my first GIt**Jenkins***Docker  Integration examples.........";
	}
	
	@GetMapping("/welcome/{name}")
	public String welcometoYou(@RequestParam String name) {
		
		return "Welcome to my first GIt**Jenkins***Docker  Integration examples........."+name;
	}
}
