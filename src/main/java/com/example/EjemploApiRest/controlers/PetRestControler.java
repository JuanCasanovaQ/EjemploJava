package com.example.EjemploApiRest.controlers;

import com.example.EjemploApiRest.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pet/")
public class PetRestControler {
    private PetService petService;
    @Autowired
    public PetRestControler(PetService petService) {
        this.petService = petService;
    }


}
