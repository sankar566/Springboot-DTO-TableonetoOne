package com.vghs.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admission_open")
public class AdmissionOpen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="admission_open_id")
	private Integer admissionOpenId;
	
	@Column(name="admission_title")
	private String admissionTitle;
	
	@Column(name="admission_open_date")
	private String admissionOpenDate;
	
	@Column(name="admission_end_date")
	private String admissionEndDate;

	
	public Integer getAdmissionOpenId() {
		return admissionOpenId;
	}

	public void setAdmissionOpenId(Integer admissionOpenId) {
		this.admissionOpenId = admissionOpenId;
	}

	public String getAdmissionTitle() {
		return admissionTitle;
	}

	public void setAdmissionTitle(String admissionTitle) {
		this.admissionTitle = admissionTitle;
	}

	public String getAdmissionOpenDate() {
		return admissionOpenDate;
	}

	public void setAdmissionOpenDate(String admissionOpenDate) {
		this.admissionOpenDate = admissionOpenDate;
	}

	public String getAdmissionEndDate() {
		return admissionEndDate;
	}

	public void setAdmissionEndDate(String admissionEndDate) {
		this.admissionEndDate = admissionEndDate;
	}
	
	

}
