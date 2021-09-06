package com.vmhs.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vmhs.student.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
