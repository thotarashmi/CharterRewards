package com.charter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charter.model.Response;
import com.charter.service.RewardsService;

@RestController
public class RewardsController {
	
	@Autowired
	private RewardsService rewardsService;
	
	@PostMapping("/getRewards")
	public Response calculateRewards(@RequestBody String request) {
		Response response = rewardsService.getRewards(request);
		return response;
	}
	

}
