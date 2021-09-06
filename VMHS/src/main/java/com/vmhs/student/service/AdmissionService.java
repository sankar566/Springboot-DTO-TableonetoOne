package com.vmhs.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vmhs.student.dto.AdmissionOpenDto;
import com.vmhs.student.model.AdmissionOpen;
import com.vmhs.student.repository.AdmissionOpenRepo;

@Service
public class AdmissionService {

  @Autowired
  private AdmissionOpenRepo admissionOpenRepo;
  
	public String addAdvertisment(AdmissionOpenDto admissionOpenDto) {
		// TODO Auto-generated method stub
		AdmissionOpen admissionOpen = new AdmissionOpen();
		admissionOpen.setAdmissionTitle(admissionOpenDto.getAdmissionTitle());
		admissionOpen.setAdmissionOpenDate(admissionOpenDto.getAdmissionOpenDate());
		admissionOpen.setAdmissionEndDate(admissionOpenDto.getAdmissionEndDate());
		admissionOpenRepo.save(admissionOpen);
		return "Successfully Admission Open Advertisment added......";
	}

}
