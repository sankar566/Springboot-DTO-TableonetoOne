package com.vmhs.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vmhs.student.model.Examination;

public interface ExaminationRepo extends JpaRepository<Examination, Integer>{

}
