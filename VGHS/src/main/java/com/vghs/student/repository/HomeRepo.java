package com.vghs.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vghs.student.model.StudentData;

@Repository
public interface HomeRepo extends JpaRepository<StudentData, Integer>{
	
	public StudentData  findByStudentId(Integer studentId);
	
	@Query("Select s from StudentData s where s.studentId = :studentId")
	public StudentData getStudentById(@Param("studentId")Integer studentId);
	
	public StudentData   findByFirstName(String firstName);
	
	@Query("Select s from StudentData s where s.firstName = :firstName")
	public StudentData getStudentByName(@Param("firstName")String firstName);
	
}
