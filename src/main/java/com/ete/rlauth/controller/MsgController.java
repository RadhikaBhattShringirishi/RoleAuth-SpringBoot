package com.ete.rlauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@GetMapping("/getmg")
	public String getMsg() {
		return "I m using mgsEndpoint";
		
	}
	
	@GetMapping("/getstdmsg")
	public String studentMsg() {
		return "Hello Student!";
		
	}

}
