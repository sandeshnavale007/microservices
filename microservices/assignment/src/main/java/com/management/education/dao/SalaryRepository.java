package com.management.education.dao;

import org.springframework.data.repository.CrudRepository;

import com.management.education.entity.Salary;

public interface SalaryRepository extends CrudRepository<Salary, Long> {

	Salary findByEmployeeId(long id);

}
