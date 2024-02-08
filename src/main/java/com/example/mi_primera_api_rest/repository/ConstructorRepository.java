package com.example.mi_primera_api_rest.repository;

import com.example.mi_primera_api_rest.model.Constructor;
import com.example.mi_primera_api_rest.projections.ConstructorDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConstructorRepository extends JpaRepository<Constructor, Long> {
   Optional<Constructor> findByConstructorrefIgnoreCase(String constructorref);

   Optional<ConstructorDetails> findByConstructorid(Long id);


}
