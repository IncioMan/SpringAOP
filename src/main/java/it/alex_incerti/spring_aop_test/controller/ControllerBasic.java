package it.alex_incerti.spring_aop_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import it.alex_incerti.spring_aop_test.model.Update;

@Controller
@RequestMapping(value = "/")
public class ControllerBasic {

	@GetMapping
	@ResponseBody
	public String getMapping() {
		System.out.println("getMapping in ControllerBasic called");

		System.out.println("Creating update");
		sendUpdate("nome");

		return "start from here";
	}

	@GetMapping("/update")
	@ResponseBody
	public String sendUpdate(@RequestParam String name) {
		Update update = new Update();
		update.setName(name);
		return "Sending update: " + update.getName();
	}
}
