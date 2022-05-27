package com.hrc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RunnerController {

	@RequestMapping("/index")
	public String index() {
		return "index"; 
	}
	
	@RequestMapping("/json")
	public @ResponseBody String json() {
		
		return "{\"res_code\":200}";
	}
	
	
}
