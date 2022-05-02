package com.example.ProjetSFE.Service;

import com.example.ProjetSFE.Model.Patient;
import com.example.ProjetSFE.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;
    public Patient createPatient(Patient patient){
        return patientRepository.save(patient);
    }
    public List<Patient> getAllPatient(){
        return patientRepository.findAll();
    }
}
