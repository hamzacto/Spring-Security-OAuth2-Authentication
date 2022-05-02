package com.example.ProjetSFE.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id", nullable = false)
    private Long patientId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String CIN;
    private String gender;
    private Situation situation;
    private String ville;
    private String addresse;
    private String tel;
    private String serie;
    private String organisme;
    private String deligation;
    



}
