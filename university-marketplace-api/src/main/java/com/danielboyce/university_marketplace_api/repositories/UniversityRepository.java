package com.danielboyce.university_marketplace_api.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danielboyce.university_marketplace_api.models.University;
@Repository
public interface UniversityRepository extends JpaRepository<University,Long> {

    public Optional<University> findByName(String name);

    public Optional<University> findById(Long id);

    public List<University> findALL();

}
