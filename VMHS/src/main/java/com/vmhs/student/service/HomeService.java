package com.vmhs.student.service;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vmhs.student.dto.AdmissionOpenDto;
import com.vmhs.student.dto.DepartmentDto;
import com.vmhs.student.dto.ExaminationDto;
import com.vmhs.student.dto.StudentDataDto;
import com.vmhs.student.dto.StudentDepartmentDto;
import com.vmhs.student.model.AdmissionOpen;
import com.vmhs.student.model.Department;
import com.vmhs.student.model.Examination;
import com.vmhs.student.model.StudentData;
import com.vmhs.student.repository.AdmissionOpenRepo;
import com.vmhs.student.repository.DepartmentRepo;
import com.vmhs.student.repository.ExaminationRepo;
import com.vmhs.student.repository.HomeRepo;

@Service
public class HomeService {
	
	@Autowired
	private HomeRepo homeRepo;
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@Autowired
	private AdmissionOpenRepo admissionOpenRepo;
	
	@Autowired
	private ExaminationRepo examinationRepo;

	public String addStudentDetails(StudentData studentData) {
		homeRepo.save(studentData);
		return "Successfully student details added";
	}
	
	
	public StudentDataDto getStudentById(Integer studentId) {
		
		StudentData studentData=homeRepo.getById(studentId);
		StudentDataDto studentdatadto=new StudentDataDto();
		DepartmentDto departmentdto=new DepartmentDto();
		
		studentdatadto.setStudentId(studentData.getStudentId());
		studentdatadto.setFirstName(studentData.getFirstName());
		studentdatadto.setLastName(studentData.getLastName());
		studentdatadto.setAddress(studentData.getAddress());
		studentdatadto.setAdmissiondate(studentData.getAdmissiondate());
		studentdatadto.setAge(studentData.getAge());
		studentdatadto.setDateofbirth(studentData.getDateofbirth());
		studentdatadto.setCity(studentData.getCity());
		studentdatadto.setCountry(studentData.getCountry());
		studentdatadto.setReligion(studentData.getReligion());
		studentdatadto.setGender(studentData.getGender());
		studentdatadto.setMobile(studentData.getMobile());
		studentdatadto.setEmail(studentData.getEmail());
		studentdatadto.setMothertongue(studentData.getMothertongue());
		studentdatadto.setState(studentData.getState());
		studentdatadto.setState(studentData.getMothertongue());
		
		departmentdto.setDepartmentId(studentData.getDeparmentdata().getDepartmentId());
		departmentdto.setDepartmentCode(studentData.getDeparmentdata().getDepartmentCode());
		departmentdto.setBaseLanguage(studentData.getDeparmentdata().getBaseLanguage());
		departmentdto.setDepartmentName(studentData.getDeparmentdata().getDepartmentName());
		departmentdto.setDepartmentType(studentData.getDeparmentdata().getDepartmentType());
		studentdatadto.setDepartment(departmentdto);
		return studentdatadto;
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
		if(studentDataDto != null) {
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
		studentData.setEmail(studentDataDto.getEmail());
		studentData.setMothertongue(studentDataDto.getMothertongue());
		studentData.setState(studentDataDto.getState());
		studentData.setState(studentDataDto.getMothertongue());
		
		StudentData studentDataRs =  homeRepo.save(studentData);
		if(studentDataDto.getDepartment() != null) {
		System.out.println("SID==========="+studentDataRs.getStudentId());
		department.setStudent(studentDataRs);
		department.setDepartmentCode(studentDataDto.getDepartment().getDepartmentCode());
		department.setBaseLanguage(studentDataDto.getDepartment().getBaseLanguage());
		department.setDepartmentName(studentDataDto.getDepartment().getDepartmentName());
		department.setDepartmentType(studentDataDto.getDepartment().getDepartmentType());
		departmentRepo.save(department);
		}
		if(studentDataDto.getExamination() !=null) {
			Examination examination =  null;
			for(ExaminationDto examData : studentDataDto.getExamination()) {
				examination =  new Examination();
				examination.setExamName(examData.getExamName());
				examination.setExamType(examData.getExamType());
				examination.setExamDate(examData.getExamDate());
				examination.setStudent(studentDataRs);
				examinationRepo.save(examination);
			}
		}
		}
		return "Successfully registered.........";
	}

}
