package com.management.education.service;

import java.util.List;

import com.management.education.dto.EducationUserDto;
import com.management.education.entity.Category;


public interface IEducationService {

	public String save(EducationUserDto employeeDto);

	public String saveCar(Category category);

	public  List<Category> findAll();

//	public String login(Login login);

}
