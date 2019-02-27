package com.twobeardedguys.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.twobeardedguys.entity.User;
import com.twobeardedguys.repository.UserRepository;

@Controller
public class WebControl {
	
	@Autowired
	private UserRepository userRepo;
	

	@GetMapping("/")
	public String root (ModelMap model) {
		
		List<User> allUsers = userRepo.findAll();
		User user = new User();
		
		model.put("allUsers", allUsers);
		model.put("user", user);
		
		return "register";
	}
	
	@PostMapping("/")
	public String rootPost (User user) {
		userRepo.save(user);
		
		return"redirect:/";
	}
}
