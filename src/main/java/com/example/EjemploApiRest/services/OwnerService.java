package com.example.EjemploApiRest.services;

import com.example.EjemploApiRest.models.Owner;
import com.example.EjemploApiRest.repositories.IOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {
    private IOwnerRepository ownerRepository;
    @Autowired

    public OwnerService(IOwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public void createOwner (Owner owner){
        ownerRepository.save(owner);
    }
    public List<Owner> listOwner(){
        return ownerRepository.findAll();
    }
    public Optional<Owner> findById(Long id){
        return ownerRepository.findById(id);
    }
    public void updateOwner (Owner owner){
        ownerRepository.save(owner);
    }
    public void deleteOwner(Long id){
        ownerRepository.deleteById(id);
    }

    public List<Owner> listOwnerByName(String name){
        return ownerRepository.findByName(name);
    }
    public List<Owner> listOwnerByAddress(String address){
        return ownerRepository.findByAddress(address);
    }
    public List<Owner> listOwnerByCity(String city){
        return ownerRepository.findByCity(city);
    }
    public List<Owner> listOwnerByYearOfBirth(int yearOfBirth){
        return ownerRepository.findByYearOfBirth(yearOfBirth);
    }
    public List<Owner> listOwnerByPhoneNumber(String phoneNumber){
        return ownerRepository.findByPhoneNumber(phoneNumber);
    }



}
