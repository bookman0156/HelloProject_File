package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContlloer {
	@RequestMapping(value="/hello")
	private String hello() {
		return "/index.html";
	}
}
