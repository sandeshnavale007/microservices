package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")

public class TestController {
	
@PostMapping("/")
public String submit(@RequestParam String studentName) {
	System.out.println("test--------------------"+studentName);
	return studentName;
}

}
