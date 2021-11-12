package com.wolken.sam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	String printHello() {
		System.out.println("This is next page");
		return "hello.jsp";
	}
}
