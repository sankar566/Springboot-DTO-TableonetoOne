package com.vmhs.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vmhs.student.model.AdmissionOpen;

@Repository
public interface AdmissionOpenRepo extends JpaRepository<AdmissionOpen, Integer> {

	public AdmissionOpen findByAdmissionOpenId(Integer admissionOpenId);
}
