package com.tka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({"/", "","/home"})
	public String showHomePage() {
		return "home.html";
	}
	
	@GetMapping("/projects")
	public String showProjectPage() {
		return "projects.html";
	}
	
	@GetMapping("/resume")
	public String showResumePage() {
		return "resume.html";
	}
	
	@GetMapping("/contact")
	public String showContactPage() {
		return "contact.html";
	}
}
