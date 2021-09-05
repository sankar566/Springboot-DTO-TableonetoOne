package com.college.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="college")

public class StudentRegister {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column (name = "rollnumber")
private Integer rollnumber;

@Column (name = "name")
private String name;

@Column (name = "fathername")
private String fathername;

@Column (name = "department")
private String department;

@Column (name = "dob")
private String dob;

@Column (name = "year")
private int year;

@OneToOne(mappedBy="studentregister")
private Department departmentdata;

public Department getDepartmentdata() {
	return departmentdata;
}
public void setDepartmentdata(Department departmentdata) {
	this.departmentdata = departmentdata;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
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

public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}

}
