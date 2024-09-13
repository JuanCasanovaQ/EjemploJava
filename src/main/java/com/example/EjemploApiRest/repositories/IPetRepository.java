package com.example.EjemploApiRest.repositories;


import com.example.EjemploApiRest.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPetRepository extends JpaRepository<Pet, Long> {
    List<Pet> findByName(String name);
    List<Pet> findByWeight(double weight);
    List<Pet> findByRace(String race);
    List<Pet> findByYearOfBirth(int yearOfBirth);

}
