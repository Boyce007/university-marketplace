package com.danielboyce.university_marketplace_api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielboyce.university_marketplace_api.models.University;
import com.danielboyce.university_marketplace_api.repositories.UniversityRepository;

@Service
public class UniversityService {


    private UniversityRepository universityRepo;
    @Autowired
    public UniversityService(UniversityRepository universityRepository ) {
        this.universityRepo = universityRepository;
    
    }


    public University create(University university) {
        return universityRepo.save(university);
    }

    public University getByName(String name) {
        Optional<University> uni = universityRepo.findByName(name);
        
    }



}
