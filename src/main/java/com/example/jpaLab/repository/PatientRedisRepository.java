package com.example.jpaLab.repository;

import com.example.jpaLab.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRedisRepository extends CrudRepository<Patient, String> {
}

