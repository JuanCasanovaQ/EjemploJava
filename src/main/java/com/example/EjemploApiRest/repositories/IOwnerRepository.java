package com.example.EjemploApiRest.repositories;

import com.example.EjemploApiRest.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOwnerRepository extends JpaRepository<Owner, Long> {
    List<Owner> findByName(String name);
    List<Owner> findByAddress(String address);
    List<Owner> findByCity(String city);
    List<Owner> findByYearOfBirth(int yearOfBirth);
    List<Owner> findByPhoneNumber(String phoneNumber);
}
