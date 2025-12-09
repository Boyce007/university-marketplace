package com.danielboyce.university_marketplace_api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielboyce.university_marketplace_api.exceptions.UniversityNotFoundException;
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
        if (uni.isEmpty()){
            throw new UniversityNotFoundException("University with name " + name + " not found");
        }
        return uni.get();
    }
    public University getById(Long id) {
        Optional<University> uni = universityRepo.findById(id);
        if (uni.isEmpty()){
            throw new UniversityNotFoundException("University with id " + id + " not found");
        }
        return uni.get();
    }



}
