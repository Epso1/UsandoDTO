package com.example.mi_primera_api_rest.service;

import com.example.mi_primera_api_rest.model.Constructor;
import com.example.mi_primera_api_rest.model.Driver;

import java.util.List;
import java.util.Optional;

public interface ConstructorService {
    List<Constructor> getAllConstructors();
    Optional<Constructor> getConstructorByConstructorref(String constructorref);

    void saveConstructor(Constructor constructor);

    void deleteConstructorByConstructorref(String constructorref);
}
