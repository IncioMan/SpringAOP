package it.alex_incerti.spring_aop_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import it.alex_incerti.spring_aop_test.annotation.ValidUserRequested;

@Controller
@ValidUserRequested
@RequestMapping(value = "/advanced/")
public class AdvancedOperationsController {

	@GetMapping
	@ResponseBody
	public String getAdvancedOperation(@RequestParam String username, @RequestParam String password) {
		System.out.println("Processing");
		return "Logged";
	}
}
