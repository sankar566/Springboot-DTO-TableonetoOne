package com.college.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.college.model.StudentRegister;

@Repository
public interface CollegeRepo extends JpaRepository<StudentRegister,Integer> {

	
	
	@Query("select s from StudentRegister s where s.name = :name")
	public StudentRegister findname(@Param ("name")String name);
//	
@Query("select s from StudentRegister s where s.fathername = :fathername")
public StudentRegister findfathername(@Param ("fathername")String fathername);
//	
//
//	@Query("select s from StudentRegister s where s.department = :department")
//	public StudentRegister finddepartment(@Param ("department")String department);
//	
//		
	@Query("select s from StudentRegister s where s.dob = :dob")
	public StudentRegister findDob(@Param ("dob")String dob);
//
	@Query("Select s from StudentRegister s where s.rollnumber = :rollnumber")
	public StudentRegister findRollnumber(
			@Param("rollnumber")Integer rollnumber);
	
//	@Query("update s from StudentRegister set name= :name s where s.rollnumber = :rollnumber ")
//	public StudentRegister update(@Param("rollnumber")Integer rollnumber,@Param("name")String name);
	
	public StudentRegister findByRollnumber(Integer rollnumber);
	public StudentRegister findByName(String name);
   
	}

	





