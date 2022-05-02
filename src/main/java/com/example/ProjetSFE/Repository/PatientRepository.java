package com.example.ProjetSFE.Repository;

import com.example.ProjetSFE.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
