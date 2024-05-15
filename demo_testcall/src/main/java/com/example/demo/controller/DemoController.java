package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.FormData;

@CrossOrigin("*")
@RestController
public class DemoController 
{

	@GetMapping("/testGet")
	public String testGet()
	{
		System.out.println("get request received");
		return "get request received";
	}
	
	@PostMapping("/testPost")
	public String testPost(@RequestBody String data)
	{
		System.out.println("post request received : "+data);
		return "post request received "+data;
	}
	
	@PostMapping("/testForm")
	public String testForm(@RequestBody String formData)
	{
		System.out.println("Form data received : "+formData);
		return "post request received "+formData;
	}
	@PostMapping("/formData")
	public String formData(@RequestBody FormData data) {
		System.out.println("data - " + data);
		return "data - " + data;
	}
}
