package com.vasu.SpringbootDocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping("/")
	public String docker() {
		return "Nice try vishu";
	}
}
