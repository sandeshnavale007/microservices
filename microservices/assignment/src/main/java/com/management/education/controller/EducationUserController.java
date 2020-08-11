package com.management.education.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.education.dto.EducationUserDto;
import com.management.education.entity.Category;
import com.management.education.service.IEducationService;


@RestController
@RequestMapping("employee")
public class EducationUserController {
	@Autowired
	private IEducationService employeeService;

	@PostMapping("/")
	public String save(@RequestBody EducationUserDto employeedto) {
		employeeService.save(employeedto);
		return "saved";
	}
	
	@PostMapping("/addCar")
	public String saveCar(@RequestBody Category category) {
		return employeeService.saveCar(category);
	}
	
	@GetMapping("/getCar")
	private List<Category> getCar() {
		
		return (List<Category>) employeeService.findAll();
		
	}
//	@PostMapping("/login")
//	public String login(@RequestBody Login login) {
//		return employeeService.login(login);
//	}

}
