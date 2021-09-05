package com.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.dto.AdmissionDto;
import com.college.service.AdmissionSercice;

@RestController
@RequestMapping("/admission")
public class AdmissionController {
	
	@Autowired
	AdmissionSercice admissionservice;
	
	@PostMapping("/advertisement")
	public String welcomeAdmission(@RequestBody AdmissionDto admissiondto) {
		
		return admissionservice.advertisement(admissiondto) ;
		
	}
	
//	@GetMapping("getadd")
//public AdmissionDto getAdmission() {
//		
//		return admissionservice.getadvertisement();
//		
//	}

}
