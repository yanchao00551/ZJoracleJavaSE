package com.ebay.controller;

import com.ebay.event.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class RenController {
	
	@Autowired
	private Publisher publisher;
	
	@RequestMapping(value = {"/login"},method=RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("name", "admin");
		publisher.sendMsg();
		return "login";
	}
}
