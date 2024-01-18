package com.example.mi_primera_api_rest.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "races")
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "raceid")
    private Long raceid;
    @Column(nullable = false)
    private int year;
    @Column(nullable = false)
    private int round;
    @Column(nullable = false)
    private int circuitid;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private LocalTime time;
    private String url;
}


//raceid SERIAL PRIMARY KEY,
//    year integer NOT NULL,
//    round integer NOT NULL,
//    circuitid integer NOT NULL,
//    name VARCHAR (100) NOT NULL,
//    date DATE NOT NULL,
//    time TIME NOT NULL,
//    url VARCHAR (100)