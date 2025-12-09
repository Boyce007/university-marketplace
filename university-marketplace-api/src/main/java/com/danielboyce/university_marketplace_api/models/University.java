package com.danielboyce.university_marketplace_api.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long universityId;
    private String universityName;
    private String universityWebsite;


}
