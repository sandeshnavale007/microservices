package com.management.education.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.management.education.dto.EducationUserDto;
import com.management.education.dto.Login;
@FeignClient(name ="demo")

public interface IEducationFeignService {

	@PostMapping("/test/")
	public String submit(@RequestParam String studentName);

}
