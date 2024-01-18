package com.example.mi_primera_api_rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driverid")
    private Long driverId;

    @Column(unique = true, name = "code",nullable = false)
    private String code;
    @Column(nullable = false)
    private String forename;
    @Column(nullable = false)
    private String surname;

    @JsonProperty("dateOfBirth")
    @Column(nullable = false)
    private LocalDate dob;
    @Column(nullable = false)
    private String nationality;
    private String url;
}
//    driverid SERIAL PRIMARY KEY,
//    code VARCHAR (50) UNIQUE NOT NULL,
//    forename VARCHAR (50) NOT NULL,
//    surname VARCHAR (50) NOT NULL,
//    dob DATE NOT NULL,
//    nationality VARCHAR (50) NOT NULL,
//    constructorid integer,
//    url VARCHAR (100)