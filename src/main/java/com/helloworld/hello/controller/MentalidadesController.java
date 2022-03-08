package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidades")
public class MentalidadesController {
	
	@GetMapping
	public String mentalidades()
	{
		return "Persistencia";
	}
}
