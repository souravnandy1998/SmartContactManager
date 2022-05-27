package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.entities.User;
@Controller
public class HomeController {
@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("title","Home- Smart Contact Manager");
		return "home";
	}
	  @RequestMapping("/about")
	  public String about(Model model) {
	  model.addAttribute("title","About- Smart Contact Manager"); 
	  return "about"; 
	  }
	  @RequestMapping("/signup")
	  public String signup(Model model) {
	  model.addAttribute("title","Signup- Smart Contact Manager"); 
	  model.addAttribute("user", new User());
	  return "signup"; 
	  }
}
