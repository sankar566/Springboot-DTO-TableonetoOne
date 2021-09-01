package com.vghs.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vghs.student.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
