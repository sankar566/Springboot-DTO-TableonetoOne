package com.college.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admissionadd")
public class AdmissionAdd {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="admission_id")
	private Integer admissionId;
	
	@Column(name="admission_title")
	private String admissionTitle;
	
	@Column(name="admission_open_date") 
	private  String admissionOpendate ;
	
	@Column(name="admission_end_date")
	private String admissionEndDate;

	public Integer getAdmissionId() {
		return admissionId;
	}

	public void setAdmissionId(Integer admissionId) {
		this.admissionId = admissionId;
	}

	public String getAdmissionTitle() {
		return admissionTitle;
	}

	public void setAdmissionTitle(String admissionTitle) {
		this.admissionTitle = admissionTitle;
	}

	public String getAdmissionOpendate() {
		return admissionOpendate;
	}

	public void setAdmissionOpendate(String admissionOpendate) {
		this.admissionOpendate = admissionOpendate;
	}

	public String getAdmissionEndDate() {
		return admissionEndDate;
	}

	public void setAdmissionEndDate(String admissionEndDate) {
		this.admissionEndDate = admissionEndDate;
	}
}
	