package com.college.dto;


public class StudentRegisterDto {
	
private	Integer rollnumber;
	
private	String name;

private	String fathername;

private	String department;

private	String dob;
	
private	int year;

private DepartmentDto departmentDto;

public DepartmentDto getDepartmentDto() {
	return departmentDto;
}

public void setDepartmentDto(DepartmentDto departmentDto) {
	this.departmentDto = departmentDto;
}

public Integer getRollnumber() {
	return rollnumber;
}

public void setRollnumber(Integer rollnumber) {
	this.rollnumber = rollnumber;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFathername() {
	return fathername;
}

public void setFathername(String fathername) {
	this.fathername = fathername;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}



}
