package com.example.jpaLab.service;

import com.example.jpaLab.model.MongoPatient;
import com.example.jpaLab.repository.PatientMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoPatientService {

    @Autowired
    private PatientMongoRepository patientMongoRepository;

    public MongoPatient createPatient(MongoPatient patient) {
        return patientMongoRepository.save(patient);
    }

    public MongoPatient getPatientById(String id) {
        return patientMongoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Patient not found"));
    }

    public List<MongoPatient> getAllPatients() {
        return patientMongoRepository.findAll();
    }

    public void deletePatient(String id) {
        patientMongoRepository.deleteById(id);
    }
}
