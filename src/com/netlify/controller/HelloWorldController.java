package com.netlify.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.netlify" })
public class HelloWorldController {

	@RequestMapping(value = "helloworld/say", method = { RequestMethod.GET })
	@ResponseBody
	public String fetch() {
		return "Hello World";
	}
	
}
