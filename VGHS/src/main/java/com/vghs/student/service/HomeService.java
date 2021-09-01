package com.vghs.student.service;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vghs.student.dto.AdmissionOpenDto;
import com.vghs.student.dto.StudentDataDto;
import com.vghs.student.dto.StudentDepartmentDto;
import com.vghs.student.model.AdmissionOpen;
import com.vghs.student.model.Department;
import com.vghs.student.model.StudentData;
import com.vghs.student.repository.AdmissionOpenRepo;
import com.vghs.student.repository.DepartmentRepo;
import com.vghs.student.repository.HomeRepo;

@Service
public class HomeService {
	
	@Autowired
	private HomeRepo homeRepo;
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@Autowired
	private AdmissionOpenRepo admissionOpenRepo;

	public String addStudentDetails(StudentData studentData) {
		homeRepo.save(studentData);
		return "Successfully student details added";
	}
	
	
	public StudentData getStudentById(Integer studentId) {
		return homeRepo.getStudentById(studentId);
	}
	

	public List<StudentData> getStudentList() {
		List<StudentData> studentList = homeRepo.findAll();
		List<StudentData> studentListWithFemale = new ArrayList<>();
		
		for(StudentData student : studentList) {
			if("male".equalsIgnoreCase(student.getGender())) {
				studentListWithFemale.add(student);
			}
		}
		return studentListWithFemale;
	}


	public String updateStudentDetails(Integer studentId) {
		StudentData studentData = homeRepo.getStudentById(studentId);
		if(studentData != null) {
			studentData.setLastName("Velu");
			studentData.setFirstName("Denesh");
			homeRepo.save(studentData);
		}
		return "Successfully student details updated...";
	}


	public AdmissionOpenDto getAdmissionInfo(Integer admissionId) {
		// TODO Auto-generated method stub
		AdmissionOpenDto admissionOpenDto= new AdmissionOpenDto();
		AdmissionOpen admissionOpen = admissionOpenRepo.findByAdmissionOpenId(admissionId);
		if(admissionOpen != null) {
		admissionOpenDto.setAdmissionOpenId(admissionOpen.getAdmissionOpenId());
		admissionOpenDto.setAdmissionOpenDate(admissionOpen.getAdmissionOpenDate());
		admissionOpenDto.setAdmissionEndDate(admissionOpen.getAdmissionEndDate());
		admissionOpenDto.setAdmissionTitle(admissionOpen.getAdmissionTitle());
		return admissionOpenDto;
		}else {
			return null;
		}
	}


	public String addStudentDepartmentDetails(StudentDataDto studentDataDto) {
		StudentData studentData = new StudentData();
		Department department = new Department();

		studentData.setFirstName(studentDataDto.getFirstName());
		studentData.setLastName(studentDataDto.getLastName());
		studentData.setAddress(studentDataDto.getAddress());
		studentData.setAdmissiondate(studentDataDto.getAdmissiondate());
		studentData.setAge(studentDataDto.getAge());
		studentData.setDateofbirth(studentDataDto.getDateofbirth());
		studentData.setCity(studentDataDto.getCity());
		studentData.setCountry(studentDataDto.getCountry());
		studentData.setReligion(studentDataDto.getReligion());
		studentData.setGender(studentDataDto.getGender());
		studentData.setMobile(studentDataDto.getMobile());
		studentData.setMothertongue(studentDataDto.getEmail());
		studentData.setState(studentDataDto.getState());
		
		StudentData studentDataRs =  homeRepo.save(studentData);
		System.out.println("SID==========="+studentDataRs.getStudentId());
		department.setStudent(studentDataRs);
		department.setDepartmentCode(studentDataDto.getDepartment().getDepartmentCode());
		department.setBaseLanguage(studentDataDto.getDepartment().getBaseLanguage());
		department.setDepartmentName(studentDataDto.getDepartment().getDepartmentName());
		department.setDepartmentType(studentDataDto.getDepartment().getDepartmentType());
		departmentRepo.save(department);
		return "Successfully registered.........";
	}

}
