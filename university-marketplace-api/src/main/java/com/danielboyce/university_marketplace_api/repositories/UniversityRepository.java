package com.danielboyce.university_marketplace_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielboyce.university_marketplace_api.models.University;

public interface UniversityRepository extends JpaRepository<University,Long> {

}
