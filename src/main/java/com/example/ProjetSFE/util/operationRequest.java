package com.example.ProjetSFE.util;


import lombok.Data;

@Data
public class operationRequest {
    private Integer sendingid ;
    private String recievingEmail;
    private Double montant;
}
