package com.management.education.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.education.dao.CategoryRepository;
//import com.management.education.common.TokenManager;
import com.management.education.dao.EducationUserRepository;
import com.management.education.dto.EducationUserDto;
import com.management.education.entity.Category;
import com.management.education.entity.EducationUser;


@Service
public class EducationService implements IEducationService {

	@Autowired
	private EducationUserRepository repository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private IEducationFeignService employeeService1;

	@Override
	public String save(EducationUserDto employeeDto) {
		EducationUser employee = new EducationUser();
			BeanUtils.copyProperties(employeeDto, employee);
			repository.save(employee);
			return employeeService1.submit(employee.getFullName());
	}

	@Override
	public String saveCar(Category category) {
		categoryRepository.save(category);
		return "save";
	}

	@Override
	public List<Category> findAll() {	
		// TODO Auto-generated method stub
		List<Category> category= categoryRepository.findAll();
		return category;
	}

//	@Override
//	public String login(Login login) {
//		EducationUser logindetail= repository.findByEmail(login.getUsername());
//		if(Objects.nonNull(logindetail)) {
//			String token = TokenManager.issueToken(logindetail, 24);
//			return token;
//		}else {
//			return "User Not found";
//		}	
//	}

}
