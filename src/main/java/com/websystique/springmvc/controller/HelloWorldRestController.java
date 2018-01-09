package com.websystique.springmvc.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

	@RequestMapping("/")
	public String welcome() {// Welcome page, non-rest
		return "Welcome to RestTemplate Example.";
	}

	@RequestMapping(value = "/team/v1/{id}", method = RequestMethod.GET)
	public @ResponseBody Map message(@PathVariable String id) {// REST Endpoint.

		Map<String, String> mp = new HashMap<String, String>();

		mp.put("id", id);

		return mp;
	}

	@RequestMapping(value = "/team/v1/{data}", method = RequestMethod.POST)
	public @ResponseBody Map getMessage(@PathVariable String data) {// REST
																			// Endpoint.
		Map<String, Object> mp = new HashMap<String, Object>();
		Random rand = new Random();

		int minRange = 1000, maxRange = 5000;
		int value = rand.nextInt(maxRange - minRange) + minRange;

		mp.put("id", value);
		
		return mp;
	}

	@RequestMapping(value = "/team/v1", method = RequestMethod.GET)
	public @ResponseBody Map getProcessedData(@RequestParam("id") String id) {// REST
																				// Endpoint.

		Map<String, Object> mp = new HashMap<String, Object>();

		mp.put("id", id);
		mp.put("start_time", "");
		mp.put("end_time", "");
		mp.put("status", "");
		mp.put("word_freq", "");
		mp.put("vowel_freq", "");
		mp.put("sentiment", "");
		mp.put("completed_task", "");

		return mp;
	}

}
