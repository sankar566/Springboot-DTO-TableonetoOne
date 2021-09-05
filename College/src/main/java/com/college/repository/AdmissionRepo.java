package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.college.model.AdmissionAdd;

@Repository
public interface AdmissionRepo extends JpaRepository<AdmissionAdd,Integer> {

}
