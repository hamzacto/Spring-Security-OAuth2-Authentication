package com.example.ProjetSFE.Controller;

import com.example.ProjetSFE.Model.Patient;
import com.example.ProjetSFE.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;
    @PostMapping("/patient/new")
    public Patient createPatient(@RequestBody Patient patient){
        return patientService.createPatient(patient);
    }
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping("/patient/list")
    public List<Patient> getAllPatient(){
        return patientService.getAllPatient();
    }
}