package com.example.EjemploApiRest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet")
    private Long idPet;
    private String name;
    private double weight;
    private String race;
    private int yearOfBirth;

    @ManyToOne
    @JoinColumn(name = "id_owner")
    private Owner owner;

}
