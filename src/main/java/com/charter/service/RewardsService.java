package com.charter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.charter.model.Response;

@Service
public class RewardsService {

	public Response getRewards(String request) {
		
		
		Response response = new Response();
		
		try {
			calculateRewards(request);
		}catch(Exception e) {
			response.setErrorFound(true);
			if(e instanceof NumberFormatException) {
				response.setErrorMessage("Invalid input found!");
			} else {
				response.setErrorMessage("Internal Error occured, please check input and try again!");
			}
			
		}
		
		
		response.setRewards(1000);
		return response;
	}

	private int calculateRewards(String request) {
		int rewards = 0;
		request = request.substring(0, request.length() - 1);
		for (String m : request.split("%0A")) {
			try {
				
				if(m == null || m.trim().length() == 0) {
					continue;
				}
				
				int amount = Integer.parseInt(m);
				rewards += getRewards(amount);
			} catch (Exception e) {
				throw e;
			}
		}
		return rewards;
	}

	private int getRewards(int amount) {
		int rewards = 0;
		if (amount > 50 && amount <= 100) {
			rewards = amount - 50;
		} else if (amount > 100) {
			rewards = 50;
			rewards += (amount - 100) * 2;
		}
		return rewards;
	}

}
