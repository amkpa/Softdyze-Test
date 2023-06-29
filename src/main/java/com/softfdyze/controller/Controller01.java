package com.softfdyze.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.softfdyze.entity.SoftDyzeData;
import com.softfdyze.service.ServiceClass;

@Controller
public class Controller01 {
	@Autowired
	private ServiceClass src;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("book",new SoftDyzeData());
		return "index";
	}
	@PostMapping("/save")
	public String addbook(@ModelAttribute SoftDyzeData book,Model model) {
		src.save(book);
		model.addAttribute("book",new SoftDyzeData());
		return "index";
	}
}
