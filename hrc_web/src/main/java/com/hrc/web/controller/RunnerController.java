package com.hrc.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hrc.web.mapper.TestMapper;

@Controller
public class RunnerController {

	@Autowired
	TestMapper testMapper;
	
	@RequestMapping("/index")
	public String index() {
		return "index"; 
	}
	
	@RequestMapping("/json")
	public @ResponseBody String json() {
		return "{\"res_code\":200}";
	}
	
	
	@ResponseBody
	@RequestMapping(value="/attendByName", method=RequestMethod.POST)
	public Map<String,String> attendByName(@RequestBody Map<String,String> map) {
	    System.out.println(map);
	    return map;
	}
	
	@ResponseBody
	@RequestMapping(value="selectAllRunner", method = {RequestMethod.GET, RequestMethod.POST})
	public List<HashMap<String, Object>> selectAllRunner(){
		return testMapper.selectAll();
	}
	
	
}
