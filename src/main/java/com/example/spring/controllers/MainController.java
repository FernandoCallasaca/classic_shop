package com.example.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	// Create our base direction URL
	@GetMapping("/")
	public String portada(Model model) {
		model.addAttribute("portada", "TIENDITA DE LETIFERTI");
		return "index";
	}
	
	// Create our get direction to (what we are)
	@GetMapping("/what")
	public String que(Model model) {
		model.addAttribute("what", "¿Qué hacemos?");
		return "what";
	}
	
	// Create a get direction to out contact
	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("contact", "Contacto");
		return "contact";
	}
	
}
