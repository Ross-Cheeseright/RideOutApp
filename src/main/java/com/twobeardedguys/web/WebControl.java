package com.twobeardedguys.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.twobeardedguys.entity.User;
import com.twobeardedguys.entity.Rideout;
import com.twobeardedguys.repository.UserRepository;
import com.twobeardedguys.repository.RideoutRepository;

@Controller
public class WebControl {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private RideoutRepository rideoutRepo;
	
	@GetMapping("/")
	public String root (ModelMap model) {
		
		return "landingPage";
	}
	

	
	@RequestMapping("/addRideout")
	public String addRideout (ModelMap model) {
		
		List<Rideout> allRideouts = rideoutRepo.findAll();
		Rideout rideout = new Rideout();
		
		model.put("allRideouts", allRideouts);
		model.put("rideout", rideout);
		
		return "addRideout";
	}
	
	@PostMapping("/addRideout")
	public String rideoutPost (Rideout rideout) {
		rideoutRepo.save(rideout);
		
		return"redirect:/";
	}

	@RequestMapping("/register")
	public String register(ModelMap model) {
		
		List<User> allUsers = userRepo.findAll();
		User user = new User();
		
		model.put("allUsers", allUsers);
		model.put("user", user);
		
		return "register";
	}
	
	@PostMapping("/register")
	public String registerPost(User user) {
		userRepo.save(user);
		
		return"redirect:/";
	}

}
