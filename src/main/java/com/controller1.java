package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller1 {
	@GetMapping(value="/get")
	public String gethello() {
		return "hello world";
		}

}
