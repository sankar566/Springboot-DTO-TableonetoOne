package com.vmhs.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vmhs.student.dto.AdmissionOpenDto;
import com.vmhs.student.service.AdmissionService;

@RestController
@RequestMapping("/admission")
public class AdmissionController {

	@Autowired
	private AdmissionService admissionService;
	
	@PostMapping("/addadmissionopen")
	public String admissionAddAdvertisement(@RequestBody AdmissionOpenDto admissionOpenDto) {
		
		return admissionService.addAdvertisment(admissionOpenDto);
	}
}
