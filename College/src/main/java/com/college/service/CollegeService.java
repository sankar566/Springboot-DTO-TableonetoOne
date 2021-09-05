package com.college.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.dto.DepartmentDto;
import com.college.dto.StudentRegisterDto;
import com.college.model.Department;
import com.college.model.StudentRegister;
import com.college.repository.CollegeRepo;
import com.college.repository.DepartmentRepo;

@Service
public class CollegeService {

	@Autowired
	public CollegeRepo collegerepo;
	
	@Autowired
	public DepartmentRepo departmentrepo;

	public String studentregister(StudentRegister stdreg) {
		// TODO Auto-generated method stub
		collegerepo.save(stdreg);
		return "Registration Succesfully Completed";
	}

	public List<StudentRegister> getStudentData() {
		return collegerepo.findAll();
	}

	// List<StudentRegister> list = new ArrayList();

//	public String updateStudent(Integer rollnumber,StudentRegister student) {
//
//		collegerepo.findAll().forEach(s -> {
//			if (s.getRollnumber().equals(rollnumber))
//				collegerepo.save(student);
//		});
//		return "update ***" + rollnumber + "****succesfully";
//	}
//delete id
	public String deletedata(Integer rollnumber) {
		// TODO Auto-generated method stub
		collegerepo.deleteById(rollnumber);
		return "delete  ***" + rollnumber + " ****  successfuly";
	}
//call by Query
	
	public StudentRegister findByRollnumber(Integer rollnumber) {
		return collegerepo.findRollnumber(rollnumber);
	}

	public StudentRegister findByName(String name) {
		return collegerepo.findname(name);
	}

	public StudentRegister findByDoB(String dob) {
		return collegerepo.findDob(dob);
	}


	//update student by rollnumber
	public String updateName(Integer rollnumber) {
		// TODO Auto-generated method stub
		
		StudentRegister student=collegerepo.findRollnumber(rollnumber);
		//for(StudentRegister data:student) {
			if(student != null) {
				student.setName("nandhakumar");
				student.setFathername("ramalingam");
		}
		return rollnumber+ "  is  Update successfully";
	}
//get department list of student 	
public List<StudentRegister> getdepartment(){
	List<StudentRegister> list=collegerepo.findAll();
	List<StudentRegister>studentbydept=new ArrayList<StudentRegister>();
	for(StudentRegister data:list) {
		if(!"eee".equalsIgnoreCase(data.getDepartment()));
		studentbydept.add(data);
		return studentbydept;
	}
return list;
}
//student with department register
public String studentDepartmentRegisteration(StudentRegisterDto studentdepartmetdto) {
	StudentRegister studentregister=new  StudentRegister();
	Department department=new Department();
	
	studentregister.setName(studentdepartmetdto.getName());
	studentregister.setFathername(studentdepartmetdto.getFathername());
	studentregister.setDob(studentdepartmetdto.getDob());
	studentregister.setYear(studentdepartmetdto.getYear());
	StudentRegister studentresult=collegerepo.save(studentregister);
	
	department.setDepartmentName(studentdepartmetdto.getDepartmentDto().getDepartmentName());
	department.setDepartmentCode(studentdepartmetdto.getDepartmentDto().getDepartmentCode());
	department.setDepartmentType(studentdepartmetdto.getDepartmentDto().getDepartmentType());
	department.setBaseLaguage(studentdepartmetdto.getDepartmentDto().getBaseLaguage());
	department.setStudentregister(studentresult);
	departmentrepo.save(department);
	
	
	
	return "Student and Department Registeration Successfully";
}
public StudentRegisterDto getstudentwithdepartment(Integer rollnumber)
{
	StudentRegister studentdata=collegerepo.getById(rollnumber);

	StudentRegisterDto studentregisterdto=new StudentRegisterDto();
	
	DepartmentDto departmentdto=new DepartmentDto();

studentregisterdto.setName(studentdata.getName());
studentregisterdto.setFathername(studentdata.getFathername());
studentregisterdto.setRollnumber(studentdata.getRollnumber());
studentregisterdto.setDob(studentdata.getDob());
studentregisterdto.setYear(studentdata.getYear());
	
departmentdto.setDepartmentId(studentdata.getDepartmentdata().getDepartmentId());
departmentdto.setDepartmentName(studentdata.getDepartmentdata().getDepartmentName());
departmentdto.setDepartmentCode(studentdata.getDepartmentdata().getDepartmentCode());
departmentdto.setDepartmentType(studentdata.getDepartmentdata().getDepartmentType());
departmentdto.setBaseLaguage(studentdata.getDepartmentdata().getBaseLaguage());

studentregisterdto.setDepartmentDto(departmentdto);
studentdata.getDepartmentdata().getDepartmentCode();
 return studentregisterdto;
}

	
}
