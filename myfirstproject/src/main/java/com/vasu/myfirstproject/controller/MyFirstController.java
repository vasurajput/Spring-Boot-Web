package com.vasu.myfirstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class MyFirstController {

	@GetMapping("/")
	public String test() {
		return "Hello Word";
	}
}
