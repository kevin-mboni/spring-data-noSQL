package com.example.jpaLab.controller;
import com.example.jpaLab.model.MongoPatient;
import com.example.jpaLab.service.MongoPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class MongoPatientController {

    @Autowired
    private MongoPatientService mongoPatientService;

    @PostMapping
    public MongoPatient createPatient(@RequestBody MongoPatient patient) {
        return mongoPatientService.createPatient(patient);
    }

    @GetMapping("/{id}")
    public MongoPatient getPatientById(@PathVariable String id) {
        return mongoPatientService.getPatientById(id);
    }

    @GetMapping
    public List<MongoPatient> getAllPatients() {
        return mongoPatientService.getAllPatients();
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable String id) {
        mongoPatientService.deletePatient(id);
    }
}

