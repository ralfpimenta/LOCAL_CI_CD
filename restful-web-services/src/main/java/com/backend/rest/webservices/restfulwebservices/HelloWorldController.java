package com.backend.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//GET
	//URI - /hello-world
	//method - Hello World	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello Word";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello Bean");
	}
}
