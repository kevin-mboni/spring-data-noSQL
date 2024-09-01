package com.example.jpaLab.repository;

import com.example.jpaLab.model.MongoPatient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientMongoRepository extends MongoRepository<MongoPatient, String> {
}
