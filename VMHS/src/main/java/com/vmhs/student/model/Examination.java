package com.vmhs.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "examination")
public class Examination {
	
	public StudentData getStudent() {
		return student;
	}

	public void setStudent(StudentData student) {
		this.student = student;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="exam_id")
	private Integer examId;
	
	@Column(name="exam_name")
	private String examName;
	
	@Column(name="exam_type")
	private String examType;
	
	@Column(name="exam_date")
	private String examDate;
	
	@ManyToOne
    @JoinColumn(name = "studentid", nullable = false)
    private StudentData student;	
	

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}
	
	
	
	

}
