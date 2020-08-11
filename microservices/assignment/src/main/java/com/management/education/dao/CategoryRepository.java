package com.management.education.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.education.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
