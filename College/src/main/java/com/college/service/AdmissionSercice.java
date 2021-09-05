package com.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.dto.AdmissionDto;
import com.college.model.AdmissionAdd;
import com.college.repository.AdmissionRepo;

@Service
public class AdmissionSercice {
	
	@Autowired
	AdmissionRepo admissionrepo;
	
	public String advertisement(AdmissionDto admissiondto) {
		AdmissionAdd admissionadd=new AdmissionAdd();
		System.out.println(admissiondto.getAdmissionTitle());
		admissionadd.setAdmissionTitle(admissiondto.getAdmissionTitle());
		admissionadd.setAdmissionOpendate(admissiondto.getAdmissionOpendate());
		admissionadd.setAdmissionEndDate(admissiondto.getAdmissionEndDate());
		admissionrepo.save(admissionadd);
		return "****Successfully Add admission****";
	}

//	public AdmissionDto getadvertisement() {
//		// TODO Auto-generated method stub
//		AdmissionDto adto=new AdmissionDto();
//		List<AdmissionAdd> add=admissionrepo.findAll();
//		if(add !=null) { 
//		for(AdmissionAdd acc:add) {
//		
//			adto.setAdmission_title(acc.getAdmission_title());
//			adto.setAdmission_open_date(acc.getAdmission_open_date());
//			adto.setAdmission_end_date(acc.getAdmission_end_date());
//			}
//		
//			
//		}
//		
//		return adto;
//	}

	

	
}
