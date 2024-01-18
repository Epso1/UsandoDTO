package com.example.mi_primera_api_rest.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "constructors")
public class Constructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "constructorid")
    private Long constructorid;
    @Column(unique = true, nullable = false)
    private String constructorref ;
    @Column(unique = true, nullable = false)
    private String name;
    @Column(nullable = false)
    private String nationality;
    private String url;
}
//    constructorid SERIAL PRIMARY KEY,
//    constructorref VARCHAR (50) UNIQUE NOT NULL,
//    name VARCHAR (100) UNIQUE NOT NULL,
//    nationality VARCHAR (50) NOT NULL,
//    url VARCHAR (100)