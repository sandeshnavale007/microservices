package com.management.education.dao;

import org.springframework.data.repository.CrudRepository;

import com.management.education.entity.EducationUser;

public interface EducationUserRepository extends CrudRepository<EducationUser, Long> {

	EducationUser findByEmail(String username);

}
