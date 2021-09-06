package com.vmhs.student.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vmhs.student.dto.AdmissionOpenDto;
import com.vmhs.student.dto.StudentDataDto;
import com.vmhs.student.model.StudentData;
import com.vmhs.student.service.HomeService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	
	@PostMapping("/studentregister")
	public String addStudentData(@RequestBody StudentData studentData) {
		
		return homeService.addStudentDetails(studentData);
		
	}
	
	@PostMapping("/studentRegisterAll")
	public String addStudentData(@RequestBody StudentDataDto studentDataDto) {
		
		return homeService.addStudentDepartmentDetails(studentDataDto);
		
	}
	
	@GetMapping("/getstudentlist")
	public List<StudentData> getStudentDetails(){
		return homeService.getStudentList();
	}

	
	@GetMapping("/getstudentbyid")
	public StudentDataDto getStudentData(@RequestParam Integer studentId) {
			

			return homeService.getStudentById(studentId);
			
		}
	
	@PutMapping("/modifystudent")
	public String updateStudentData(@RequestParam Integer studentId) {
		
		return homeService.updateStudentDetails(studentId);
	}
	
	@GetMapping("/getadmissionopen")
	public AdmissionOpenDto getAdmissionOpenInfo(@RequestParam Integer admissionId) {
		
		return homeService.getAdmissionInfo(admissionId);
	}
}
