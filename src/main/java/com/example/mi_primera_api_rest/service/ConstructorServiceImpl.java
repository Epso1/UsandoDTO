package com.example.mi_primera_api_rest.service;

import com.example.mi_primera_api_rest.model.Constructor;
import com.example.mi_primera_api_rest.model.Driver;
import com.example.mi_primera_api_rest.repository.ConstructorRepository;
import com.example.mi_primera_api_rest.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConstructorServiceImpl implements ConstructorService {
    private final ConstructorRepository repository;

    @Autowired
    public ConstructorServiceImpl(ConstructorRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Constructor> getAllConstructors() {return repository.findAll();}

    @Override
    public Optional<Constructor> getConstructorByConstructorref(String constructorref) {
        return repository.findByConstructorrefIgnoreCase(constructorref);
    }

    @Override
    public void saveConstructor(Constructor constructor) {repository.save(constructor);}

    @Override
    public void deleteConstructorByConstructorref(String constructorref) {repository.delete(getConstructorByConstructorref(constructorref).get());}
}
