package com.vghs.student.dto;

public class StudentDepartmentDto {
	
	private StudentDataDto studentDataDto;
	
	private DepartmentDto departmentDto;

	public StudentDataDto getStudentDataDto() {
		return studentDataDto;
	}

	public void setStudentDataDto(StudentDataDto studentDataDto) {
		this.studentDataDto = studentDataDto;
	}

	public DepartmentDto getDepartmentDto() {
		return departmentDto;
	}

	public void setDepartmentDto(DepartmentDto departmentDto) {
		this.departmentDto = departmentDto;
	}
	
	

}
