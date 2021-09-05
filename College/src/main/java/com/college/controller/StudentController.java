package com.college.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.college.dto.StudentRegisterDto;
import com.college.model.StudentRegister;
import com.college.service.CollegeService;

@RestController
@RequestMapping("/college")
public class StudentController {

	@Autowired
	public CollegeService collegeservice;

	@PostMapping("/registration")
	private String registration(@RequestBody StudentRegister studentdregister) {

		return collegeservice.studentregister(studentdregister);
	}

	@PostMapping("/registerwithdepartment")
	private String registerwithdepartment(@RequestBody StudentRegisterDto studentdepartmetdto) {
		return collegeservice.studentDepartmentRegisteration(studentdepartmetdto);
	}

	@GetMapping("/studentlist")
	public List<StudentRegister> details() {

		return collegeservice.getStudentData();
	}

	@PutMapping("/update")
	public String studentUpdate(@RequestParam Integer rollnumber) {
		return collegeservice.updateName(rollnumber);
	}

	@DeleteMapping("/delete")
	public String deleteData(@RequestParam Integer rollnumber) {
		return collegeservice.deletedata(rollnumber);
	}

	@GetMapping("/eee")
	public List<StudentRegister> geteee() {
		return collegeservice.getdepartment();
	}

	@GetMapping("/byname")
	public StudentRegister findByName(@RequestParam String name) {
		return collegeservice.findByName(name);
	}

	@GetMapping("/byrollnumber")
	public StudentRegister findByRollnumber(@RequestParam Integer rollnumber) {
		return collegeservice.findByRollnumber(rollnumber);
	}

	@GetMapping("/byDoB")
	public StudentRegister findByDoB(@RequestParam String dob) {
		return collegeservice.findByDoB(dob);
	}

	@GetMapping("/bydept")
	public List<StudentRegister> getDepartment() {
		return collegeservice.getdepartment();
	}
	//student details with department
	@GetMapping("/studentwithdepartment")
public StudentRegisterDto getStudentAndDepartmet(@RequestParam Integer rollnumber ){
	
	return collegeservice.getstudentwithdepartment(rollnumber);
	
	
}

}
