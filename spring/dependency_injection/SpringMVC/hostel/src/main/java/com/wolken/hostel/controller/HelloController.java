package com.wolken.hostel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
@RequestMapping("/hello")
String print()
{
	System.out.println("This is next page");
	return "hello.jsp";
}
}
