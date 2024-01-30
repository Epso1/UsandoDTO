package com.example.mi_primera_api_rest.dto;

public record DriverDTO(
        Long id,
        String code,
        String fullname,
        String nationality,
        String constructorName
) {}
