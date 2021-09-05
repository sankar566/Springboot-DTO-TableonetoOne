package com.college.dto;

public class AdmissionDto {

	private Integer admissionId;
	
	private String admissionTitle;
	
	private  String admissionOpendate;
	
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