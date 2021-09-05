package com.college.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="department")

public class Department implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="department_id")
	private Integer departmentId;
	
	@Column(name="department_name")
	private String departmentName;
	
	@Column(name="department_code")
	private String departmentCode;
	
	@Column(name="department_type")
	private String departmentType;
	
	@Column(name="base_language")
	private String baseLaguage;
	
	@OneToOne(optional=false)
	@JoinColumn(name="rollnumber")
	private StudentRegister studentregister;

	public StudentRegister getStudentregister() {
		return studentregister;
	}

	public void setStudentregister(StudentRegister studentregister) {
		this.studentregister = studentregister;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentType() {
		return departmentType;
	}

	public void setDepartmentType(String departmentType) {
		this.departmentType = departmentType;
	}

	public String getBaseLaguage() {
		return baseLaguage;
	}

	public void setBaseLaguage(String baseLaguage) {
		this.baseLaguage = baseLaguage;
	}
	
	

}
