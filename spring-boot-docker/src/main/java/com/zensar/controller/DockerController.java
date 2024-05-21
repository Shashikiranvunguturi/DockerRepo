package com.zensar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/docker")
	public String dockerImage() {
		return "<h2>Docker Image</h2";
	}

}
