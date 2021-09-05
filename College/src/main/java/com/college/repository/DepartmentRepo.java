package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.college.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer> {

	
}
