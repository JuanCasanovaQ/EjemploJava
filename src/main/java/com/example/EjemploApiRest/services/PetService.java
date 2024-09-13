package com.example.EjemploApiRest.services;

import com.example.EjemploApiRest.models.Pet;
import com.example.EjemploApiRest.repositories.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {
    private IPetRepository petRepository;
    @Autowired
    public PetService(IPetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public void createPet(Pet pet){
        petRepository.save(pet);
    }
    public List<Pet> listPets(){
        return petRepository.findAll();
    }
    public Optional<Pet> findByPetById(Long id){
        return petRepository.findById(id);
    }
    public void updatePet(Pet pet){
        petRepository.save(pet);
    }
    public void deletePet(Long id){
        petRepository.deleteById(id);
    }
    //Find by another properties

    public List<Pet> findByName(String name){
        return petRepository.findByName(name);
    }
    public List<Pet> findByWeight(double weight){
        return petRepository.findByWeight(weight);
    }
    public List<Pet> findByRace(String race){
        return petRepository.findByRace(race);
    }
    public List<Pet> findByYearOfBirt(int yearOfBirth){
        return petRepository.findByYearOfBirth(yearOfBirth);
    }
}
